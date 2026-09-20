/*Daniel Lee, CS1A, 1/27/2025, Dr.Harden, 3.22 LAB: Smallest number
 * Initial file comment:
 * The user should input three integers, separate with space.
 * The output will be the smallest of the three values.
 * 
 * By using if-else statement, I first makesure nums1 is not the smallest one
 * If not, then compare nums2 and nums3 to find the smallest one.
 */

import java.util.Scanner;

public class LabProgram{
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {

            int nums1;
            int nums2;
            int nums3;
            int ans;

            nums1 = scnr.nextInt();
            nums2 = scnr.nextInt();
            nums3 = scnr.nextInt();
            
            if (nums1 < nums2 && nums1 < nums3) {
                ans = nums1;
            }else if (nums2 < nums3) {
                ans = nums2;
            }else{
                ans = nums3;
            }

            System.out.println(ans);
        }
    }
}
