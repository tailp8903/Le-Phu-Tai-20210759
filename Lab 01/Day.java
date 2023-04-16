import java.util.Scanner;
public class Day {
    public static int get(String month){
        String fullname[] = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String abbreviation[] = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
        String letter[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String number[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        int ans = -1;
        for (int i = 0; i < 12; i++){
            if (month.equals(fullname[i]) || month.equals(abbreviation[i]) || month.equals(letter[i]) || month.equals(number[i])){
                ans = i;
                break;
            }
        }
        return ans;
    } 
    public static void main(String[] args) {
        int user_year;
        String user_month;
        Scanner sc = new Scanner(System.in);
        do {
            user_month = sc.next();
            user_year = sc.nextInt();
        } while(user_year <= 0 || (user_year + "").length() <= 2 || (user_year + "").length() > 4);
        int check;
        if (((user_year % 4 == 0) && (user_year % 100!= 0)) || (user_year%400 == 0)) check = 1;
        else check = 0;
        int index = get(user_month);
        if (index == 1){
            if (check == 1) System.out.println(29);
            else System.out.println(28);
        }
        else if (index == 0 || index == 2 || index == 4 || index == 6 || index == 7 || index == 9 || index == 11){
            System.out.println(31);
        }
        else System.out.println(30);
        sc.close();
    }
}
