class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<Character, Integer>(); 

        PriorityQueue<Character> pq = new PriorityQueue<Character>(new Comparator<Character>() {
            public int compare(Character c1, Character c2)
            {
                return map.get(c2) - map.get(c1);
            }
        }); 
               
        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1); 
        }

        for(Character c : map.keySet())
        {
            pq.add(c);
        }

        StringBuilder sb = new StringBuilder(); 

        while(!pq.isEmpty())
        {
            char a = pq.poll(); 
            char b = 0;

            if(!pq.isEmpty())
            {
                b = pq.poll();
            }

            if(b == 0)
            {
                if(!sb.isEmpty() && sb.charAt(sb.length()-1) == a)
                {   
                    return "";
                }
                else
                {
                    sb.append(a);
                    map.put(a, map.get(a)-1);
                }
            }
            else 
            {
                if(sb.length() > 0 && sb.charAt(sb.length()-1) == a)
                {
                    char temp = b;
                    b = a;
                    a = temp; 
                }

                sb.append(a); 
                sb.append(b);

                map.put(a, map.get(a)-1);
                map.put(b, map.get(b)-1);
            }

            if(map.get(a) > 0)
            {
                pq.add(a);
            }

            if(map.getOrDefault(b,0) > 0)
            {
                pq.add(b);
            }
        }

        return sb.toString();
    }
}