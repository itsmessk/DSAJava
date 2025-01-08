/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
 class Solution {
    public int findInMountainArray(int target, MountainArray mount) {
        int n = mount.length() -1;
        int start = 0;
        int end = n;
        int value = vall(mount, start, end);
        int left = bs(mount, target, start, value);
        
        if(left != -1){
            return left;
        }
        else{
            int right = bs(mount, target, value+1, end);
            return right;
        }
        
    }
    public int bs(MountainArray m, int target, int start, int end){
        boolean isSearchLeft = m.get(start) < m.get(end);
        while(start <= end){
            int mid = start + (end - start) / 2;
            int val = m.get(mid);

            if(target == val){
                return mid;
            }

            if(isSearchLeft){
                if(target < val){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > val){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            
        }
        return -1;
    }
    public int vall(MountainArray mount, int start, int end){
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mount.get(mid + 1) > mount.get(mid)){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}