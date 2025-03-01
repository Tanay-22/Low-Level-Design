package datastructuredesign;

public class MyHashMap<K, V>
{
    private static final int INITIAL_SIZE = 1 << 4;
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    public Entry[] hashTable;

    public MyHashMap()
    {
        this.hashTable = new Entry[INITIAL_SIZE];
    }

    public MyHashMap(int capacity)
    {
        int tableSize = tableSizeFor(capacity);
        this.hashTable = new Entry[INITIAL_SIZE];
    }

    final int tableSizeFor(int cap)
    {
        // finding the next exponent of 2
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;

        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    class Entry<K, V>
    {
        public K key;
        public V value;
        public Entry next;

        public Entry(K key, V value)
        {
            this.key = key;
            this.value = value;
        }

        public K getKey()
        {
            return key;
        }

        public void setKey(K key)
        {
            this.key = key;
        }

        public V getValue()
        {
            return value;
        }

        public void setValue(V value)
        {
            this.value = value;
        }
    }

    public V get(K key)
    {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        while (node != null)
        {
            if(node.key.equals(key))
            {
                return (V) node.value;
            }
            node = node.next;
        }
        return null;
    }

    public void put(K key, V value)
    {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        if(node == null)
        {
            Entry newNode = new Entry(key, value);
            hashTable[hashCode] = newNode;
        }
        else
        {
            Entry previousNode = node;
            while (node != null)
            {
                if (node.key == key)
                {
                    node.value = value;
                    return;
                }
                previousNode = node;
                node = node.next;
            }
            Entry newNode = new Entry(key, value);
            previousNode.next = newNode;
        }
    }
}
