package leet;

public class SufficeTrieProblem {

    private TrieNode root;

    static class TrieNode{
        char letter;
        int wordCount;
        int endHere;
        TrieNode [] childNode;

        public TrieNode(char letter) {
            this.letter = letter;
            this.childNode = new TrieNode[26];
        }

        public int getWordCount() {
            return wordCount;
        }

        public void setWordCount(int wordCount) {
            this.wordCount = wordCount;
        }

        public int getEndHere() {
            return endHere;
        }

        public void setEndHere(int endHere) {
            this.endHere = endHere;
        }

        public TrieNode[] getChildNode() {
            return childNode;
        }

        public void setChildNode(TrieNode[] childNode) {
            this.childNode = childNode;
        }
    }

    public SufficeTrieProblem() {
        root = new TrieNode('/');
        root.setEndHere(0);
        root.setWordCount(0);
    }

    public void insert(String word){
        TrieNode current = root;
        char[] letters = word.toCharArray();
        int index;
        for (char ch: letters){
            index = ch - 'a';
            if(current.getChildNode()[index] == null){
                current.getChildNode()[index] = getNode(index);
            }
            current.getChildNode()[index].setWordCount(current.getChildNode()[index].getWordCount()+1);
            current = current.getChildNode()[index];
        }
        current.setEndHere(1);
    }

    public boolean search(String word){
        TrieNode current = root;
        int index;

        for (char ch: word.toCharArray()){
            index = ch - 'a';
            if(current.getChildNode()[index] == null){
                return false;
            }
            current = current.getChildNode()[index];
        }

        return current.getEndHere() > 0;
    }

    public boolean startWith(String word){
        TrieNode current  = root;
        int index;

        for(char ch: word.toCharArray()){
            index = ch - 'a';
            if(current.getChildNode()[index] == null){
                return false;
            }
            current = current.getChildNode()[index];
        }
        return current.getWordCount() > 0;
    }

    private TrieNode getNode(int index) {
        char ch = (char) (index + 'a');
        TrieNode node = new TrieNode(ch);
        node.setWordCount(0);
        node.setEndHere(0);
        return node;
    }

    public static void main(String[] args) {
        SufficeTrieProblem problem = new SufficeTrieProblem();
        problem.insert("aab");
        problem.insert("acc");
        System.out.println(problem.search("aab"));
        System.out.println(problem.search("acb"));
        System.out.println(problem.startWith("aa"));
    }
}
