import java.util.*;

class transactionmonitoring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prevTime = -1 ;
        Set<String> set = new HashSet<>();
        boolean found=false;

        for(int i=0;i<n;i++){
            String sender   = sc.next();
            String receiver = sc.next();
            int timestamp  = sc.nextInt();
            sc.nextInt(); // amount — not used

            String key = sender + "-" + receiver;

            if(set.contains(key)){
                System.out.println("Duplication error!");
                found=true;
                break;
            }

            set.add(key);

            if(prevTime!=-1 && (timestamp-prevTime)>60){
                System.out.println("Time limit error!");
                found=true;
                break;
            }

            prevTime=timestamp;
        }
        
        if(found==false){
            System.out.println("All transactiohns are valid");
        }

    }
}