/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_1;


import java.util.Scanner;
public class SxepMang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, arr[], s[], kq[], temp=0;
        System.out.println("\nNhập số phần tử: ");
        n=sc.nextInt();
        arr = new int[n];
        s = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.printf("\nMảng đã nhập: ");
        
        for(int i=0;i<n;i++){
            s[i] = arr[i];
            System.out.printf(" "+arr[i]);
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=i; j<n; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.printf("\nMảng đã đã sắp xếp: ");
        
        for(int i=0;i<n;i++){
            System.out.printf(" "+arr[i]);
        }
        
        int k;
        System.out.printf("\nNhập k: ");
        k=sc.nextInt();
        
        for(int i=k;i<n-1;i++){
            s[i]=s[i+1];
        }
        
        System.out.printf("\nMảng sau khi xóa phần tử thứ %d: ", k);
        
        for(int i=0;i<n-1;i++){
            System.out.printf(" "+s[i]);
        }
        System.out.printf("\n");
    }
}
