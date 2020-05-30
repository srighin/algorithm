package com.sriman;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;

public class EncodeUrls {

    private static final String UTF_8 = StandardCharsets.UTF_8.name();

    public static void main(String[] args) {

        String flexWelcomeCloudFrontImageUrlFormat = "https://www.expedia.co.jp/rewards/howitworks?openExternalBrowser=1&brandcid={0}&rfrr={1}&locale={2}&OLACID={3}#faq";
        System.out.println(getRewardsButtonWithDeepLink(flexWelcomeCloudFrontImageUrlFormat));

    }

    private static String getRewardsButtonWithDeepLink( String hisActionDeepLink) {

        String olaCid= "OLA.{0}.MAPP.LINE.CHATBOT-{1}.{2}";
        final String brandcid = "brandCid11";
        final String rfrr = "rffr11";
        String url = null;
        try {
            String oldCidMessage = MessageFormat.format(olaCid, "US", "REWARDS_POINTS", "ref");
            url = MessageFormat.format(hisActionDeepLink, URLEncoder.encode(brandcid, UTF_8), URLEncoder.encode(rfrr, UTF_8), URLEncoder.encode("en_US", UTF_8 ), URLEncoder.encode(oldCidMessage, UTF_8 ));
        } catch (Exception e){
        }
        return url;
    }
}
