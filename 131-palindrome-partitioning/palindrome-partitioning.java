class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        cb(0, s, res, path);
        return res;
    }

    public void cb(int idx, String s, List<List<String>> res, List<String> path){
        if(idx == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = idx; i < s.length(); i++){
            if(isPal(s, idx, i)){
                path.add(s.substring(idx, i + 1));
                cb(i + 1, s, res, path);
                path.remove(path.size() - 1);
            }
        }
    }

    //Tells you if the asked substring is palindrome or not
    public boolean isPal(String s, int start, int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}