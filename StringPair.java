import java.util.*;
public class StringPair
{
    public static void main(String args[])
    {
        int n,i,count=0;
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int count1=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            switch(arr[i])
            {
                case 0: count+=2; break;
                case 1: count+=2; break;
                case 2: count+=1; break;
                case 3: count+=2; break;
                case 4: count+=2; break;        
                case 5: count+=2; break;
                case 6: count+=1; break;
                case 7: count+=2; break;
                case 8: count+=2; break;
                case 9: count+=2; break;
                case 10: count+=1; break;
                case 11: count+=3; break;
                case 12: count+=2; break;
                case 13: count+=3; break;
                case 14: count+=4; break;
                case 15: count+=3; break;
                case 16: count+=3; break;
                case 17: count+=4; break;
                case 18: count+=4; break;
                case 19: count+=4; break;
                case 20: count+=1; break;
                case 21: count+=3; break;
                case 22: count+=2; break;
                case 23: count+=3; break;
                case 24: count+=3; break;
                case 25: count+=3; break;
                case 26: count+=2; break;
                case 27: count+=3; break;
                case 28: count+=3; break;
                case 29: count+=3; break;
                case 30: count+=1; break;
                case 31: count+=3; break;
                case 32: count+=2; break;
                case 33: count+=3; break;
                case 34: count+=3; break;
                case 35: count+=3; break;
                case 36: count+=2; break;
                case 37: count+=3; break;
                case 38: count+=3; break;
                case 39: count+=3; break;
                case 40: count+=1; break;
                case 41: count+=3; break;
                case 42: count+=2; break;
                case 43: count+=3; break;
                case 44: count+=3; break;
                case 45: count+=3; break;
                case 46: count+=2; break;
                case 47: count+=3; break;
                case 48: count+=3; break;
                case 49: count+=3; break;
                case 50: count+=1; break;
                case 51: count+=3; break;
                case 52: count+=2; break;
                case 53: count+=3; break;
                case 54: count+=3; break;
                case 55: count+=3; break;
                case 56: count+=2; break;
                case 57: count+=3; break;
                case 58: count+=3; break;
                case 59: count+=3; break;
                case 60: count+=1; break;
                case 61: count+=3; break;
                case 62: count+=2; break;
                case 63: count+=3; break;
                case 64: count+=3; break;
                case 65: count+=3; break;
                case 66: count+=2; break;
                case 67: count+=3; break;
                case 68: count+=3; break;
                case 69: count+=3; break;
                case 70: count+=2; break;
                case 71: count+=4; break;
                case 72: count+=3; break;
                case 73: count+=4; break;
                case 74: count+=4; break;
                case 75: count+=4; break;
                case 76: count+=3; break;
                case 77: count+=4; break;
                case 78: count+=4; break;
                case 79: count+=4; break;
                case 80: count+=2; break;
                case 81: count+=4; break;
                case 82: count+=3; break;
                case 83: count+=4; break;
                case 84: count+=4; break;
                case 85: count+=4; break;
                case 86: count+=3; break;
                case 87: count+=4; break;
                case 88: count+=4; break;
                case 89: count+=4; break;
                case 90: count+=2; break;
                case 91: count+=4; break;
                case 92: count+=3; break;
                case 93: count+=4; break;
                case 94: count+=4; break;
                case 95: count+=4; break;
                case 96: count+=3; break;
                case 97: count+=4; break;
                case 98: count+=4; break;
                case 99: count+=4; break;
                case 100: count+=2; break;
            }
        }
        count1=pairCount(arr,n,count);
        if(count1<=100)
            result(count1, "thirteen");
        else
            System.out.println("greater 100\n");
    }
    public static int pairCount(int arr[], int n, int sum)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],0);
            }
            map.put(arr[i], map.get(arr[i])+1);
        }
        int doCount=0;
        for(int i=0;i<n;i++)
        {
            if(map.get(sum-arr[i]) != null)
            {
                doCount += map.get(sum-arr[i]);

                if(sum-arr[i] == arr[i])
                    doCount--;
            }
        }
        return doCount/2;
    }

    static void result(int num, String string)
    {
        switch(num)
        {
            case 0: System.out.println("zero"); break;
            case 1: System.out.println("one"); break;
            case 2: System.out.println("two"); break;
            case 3: System.out.println("three"); break;
            case 4: System.out.println("four"); break;        
            case 5: System.out.println("five"); break;
            case 6: System.out.println("six"); break;
            case 7: System.out.println("seven"); break;
            case 8: System.out.println("eight"); break;
            case 9: System.out.println("nine"); break;
            case 10: System.out.println("ten"); break;
            case 11: System.out.println("eleven"); break;
            case 12: System.out.println("twelve"); break;
            case 13: System.out.println("thirteen"); break;
            case 14: System.out.println("fourteen"); break;
            case 15: System.out.println("fifteen"); break;
            case 16: System.out.println("sixteen"); break;
            case 17: System.out.println("seventeen"); break;
            case 18: System.out.println("eighteen"); break;
            case 19: System.out.println("nineteen"); break;
            case 20: System.out.println("twenty"); break;
            case 21: System.out.println("twenty one"); break;
            case 22: System.out.println("twenty two"); break;
            case 23: System.out.println("twenty three"); break;
            case 24: System.out.println("twenty four"); break;
            case 25: System.out.println("twenty five"); break;
            case 26: System.out.println("twenty six"); break;
            case 27: System.out.println("twenty seven"); break;
            case 28: System.out.println("twenty eight"); break;
            case 29: System.out.println("twenty nine"); break;
            case 30: System.out.println("thirty"); break;
            case 31: System.out.println("thirty one"); break;
            case 32: System.out.println("thirty two"); break;
            case 33: System.out.println("thirty three"); break;
            case 34: System.out.println("thirty four"); break;
            case 35: System.out.println("thirty five"); break;
            case 36: System.out.println("thirty six"); break;
            case 37: System.out.println("thirty seven"); break;
            case 38: System.out.println("thirty eight"); break;
            case 39: System.out.println("thirty nine"); break;
            case 40: System.out.println("forty"); break;
            case 41: System.out.println("forty one"); break;
            case 42: System.out.println("forty two"); break;
            case 43: System.out.println("forty three"); break;
            case 44: System.out.println("forty four"); break;
            case 45: System.out.println("forty five"); break;
            case 46: System.out.println("forty six"); break;
            case 47: System.out.println("forty seven"); break;
            case 48: System.out.println("forty eight"); break;
            case 49: System.out.println("forty nine"); break;
            case 50: System.out.println("fifty"); break;
            case 51: System.out.println("fifty one"); break;
            case 52: System.out.println("fifty two"); break;
            case 53: System.out.println("fifty three"); break;
            case 54: System.out.println("fifty four"); break;
            case 55: System.out.println("fifty five"); break;
            case 56: System.out.println("fifty six"); break;
            case 57: System.out.println("fifty seven"); break;
            case 58: System.out.println("fifty eight"); break;
            case 59: System.out.println("fifty nine"); break;
            case 60: System.out.println("sixty"); break;
            case 61: System.out.println("sixty one"); break;
            case 62: System.out.println("sixty two"); break;
            case 63: System.out.println("sixty three"); break;
            case 64: System.out.println("sixty four"); break;
            case 65: System.out.println("sixty five"); break;
            case 66: System.out.println("sixty six"); break;
            case 67: System.out.println("sixty seven"); break;
            case 68: System.out.println("sixty eight"); break;
            case 69: System.out.println("sixty nine"); break;
            case 70: System.out.println("seventy"); break;
            case 71: System.out.println("seventy one"); break;
            case 72: System.out.println("seventy two"); break;
            case 73: System.out.println("seventy three"); break;
            case 74: System.out.println("seventy four"); break;
            case 75: System.out.println("seventy five"); break;
            case 76: System.out.println("seventy six"); break;
            case 77: System.out.println("seventy seven"); break;
            case 78: System.out.println("seventy eight"); break;
            case 79: System.out.println("seventy nine"); break;
            case 80: System.out.println("eighty"); break;
            case 81: System.out.println("eighty one"); break;
            case 82: System.out.println("eighty two"); break;
            case 83: System.out.println("eighty three"); break;
            case 84: System.out.println("eighty four"); break;
            case 85: System.out.println("eighty five"); break;
            case 86: System.out.println("eighty six"); break;
            case 87: System.out.println("eighty seven"); break;
            case 88: System.out.println("eighty eight"); break;
            case 89: System.out.println("eighty nine"); break;
            case 90: System.out.println("ninety"); break;
            case 91: System.out.println("ninety one"); break;
            case 92: System.out.println("ninety two"); break;
            case 93: System.out.println("ninety three"); break;
            case 94: System.out.println("ninety four"); break;
            case 95: System.out.println("ninety five"); break;
            case 96: System.out.println("ninety six"); break;
            case 97: System.out.println("ninety seven"); break;
            case 98: System.out.println("ninety eight"); break;
            case 99: System.out.println("ninety nine"); break;
            case 100: System.out.println("hundred"); break;
        }
    }

}