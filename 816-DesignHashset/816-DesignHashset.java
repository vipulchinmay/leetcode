// Last updated: 04/10/2025, 15:52:00
class MyHashSet {
    public boolean[] arr;
    public int size;
    public MyHashSet() {
        size = 1000001;
        arr = new boolean[size];
    }
    
    public void add(int key) {
        arr[key]  = true;
    }
    
    public void remove(int key) {
        arr[key] = false;
    }
    
    public boolean contains(int key) {
        return arr[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */