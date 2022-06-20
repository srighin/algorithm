package pgp;


import lombok.extern.slf4j.Slf4j;
import name.neuhalfen.projects.crypto.bouncycastle.openpgp.BouncyGPG;
import name.neuhalfen.projects.crypto.bouncycastle.openpgp.keys.callbacks.KeyringConfigCallbacks;
import name.neuhalfen.projects.crypto.bouncycastle.openpgp.keys.keyrings.KeyringConfig;
import name.neuhalfen.projects.crypto.bouncycastle.openpgp.keys.keyrings.KeyringConfigs;
import org.bouncycastle.openpgp.PGPException;
import org.bouncycastle.util.io.Streams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.security.SignatureException;


@Slf4j
public class OpenPGP {
    static String normalFile="/Users/sriman/Downloads/Others/Github/normalFile.txt";
    static String encryptedFile="/Users/sriman/Downloads/Others/Github/encrypted.txt";
    static String decryptedFile="/Users/sriman/Downloads/Others/Github/decrypted.txt";
    static String pubKey;
    static String pvtKey;

    public static void main(String[] args) throws SignatureException, NoSuchAlgorithmException, NoSuchProviderException, IOException, PGPException {
        pubKey= Files.readString(Path.of("/Users/sriman/Downloads/Others/Github/pub.txt"));
        pvtKey= Files.readString(Path.of("/Users/sriman/Downloads/Others/Github/private.txt"));
        encryptFile(normalFile, encryptedFile, pubKey, pvtKey);
        decryptFile(encryptedFile, decryptedFile, pubKey, pvtKey);
    }

    private static void encryptFile(String inputFilePath,String encryptedFilePath, String pubKey, String pvtKey) throws IOException, PGPException,
            SignatureException, NoSuchAlgorithmException, NoSuchProviderException {
        InputStream pubStream = new ByteArrayInputStream(pubKey.getBytes());
        InputStream secStream = new ByteArrayInputStream(pvtKey.getBytes());
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());

        @SuppressWarnings("deprecation")
        final KeyringConfig keyringConfig =
                KeyringConfigs.withKeyRingsFromStreams(pubStream, secStream, KeyringConfigCallbacks.withPassword(""));

        try (
                final FileOutputStream fileOutput = new FileOutputStream(encryptedFilePath);
                final BufferedOutputStream bufferedOut = new BufferedOutputStream(fileOutput);

                final OutputStream outputStream = BouncyGPG
                        .encryptToStream()
                        .withConfig(keyringConfig)
                        .withStrongAlgorithms()
                        .toRecipient("sriman456.singh@gmail.com")
                        .andSignWith("sriman456.singh@gmail.com")
                        .binaryOutput()
                        .andWriteTo(bufferedOut);
                final FileInputStream is = new FileInputStream(inputFilePath)
        ) {
            Streams.pipeAll(is, outputStream);
        }
    }

    private static void decryptFile(String encFilePath,String destFilePath, String pubKey, String pvtKey) throws IOException, PGPException, NoSuchProviderException {
        InputStream pubStream = new ByteArrayInputStream(pubKey.getBytes());
        InputStream secStream = new ByteArrayInputStream(pvtKey.getBytes());
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        @SuppressWarnings("deprecation")
        final KeyringConfig keyringConfig =
                KeyringConfigs.withKeyRingsFromStreams(pubStream, secStream, KeyringConfigCallbacks.withPassword(""));

        try (
                final FileInputStream cipherTextStream = new FileInputStream(encFilePath);
                final FileOutputStream fileOutput = new FileOutputStream(destFilePath);
                final BufferedOutputStream bufferedOut = new BufferedOutputStream(fileOutput);

                final InputStream plaintextStream = BouncyGPG
                        .decryptAndVerifyStream()
                        .withConfig(keyringConfig)
                        .andIgnoreSignatures()
                        .fromEncryptedInputStream(cipherTextStream)
        ) {
            Streams.pipeAll(plaintextStream, bufferedOut);
        }
    }

}
