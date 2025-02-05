/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int solgPhieu;

        System.out.printf("\n Nhập số lượng phiếu: ");
        solgPhieu = sc.nextInt();

        phieuPhong dsPhieu[];
        dsPhieu = new phieuPhong[solgPhieu];

        while (true) {

            System.out.print("\n\t1.Nhập danh sách các phiếu");
            System.out.print("\n\t2.In danh sách các phiếu của các phòng");
            System.out.print("\n\t3.In ra phiếu của một phòng nào đó");
            System.out.print("\n\t4.Tổng tiền của thiết bị của các phòng");
            System.out.print("\n\t5.Tổng tiền của thiết bị của một phòng nào đó");
            System.out.print("\n\t0.Thoát.");

            System.out.printf("\nNhập lựa chọn: ");
            int select = sc.nextInt();

            //Nó sẽ KHÔNG bỏ qua đoạn nhập số phòng
            sc.nextLine();

            switch (select) {
                case 1:

                    for (int i = 0; i < solgPhieu; i++) {
                        dsPhieu[i] = new phieuPhong();
                        dsPhieu[i].nhapPhieu();
                    }
                    break;

                case 2:
                    for (int i = 0; i < solgPhieu; i++) {
                        dsPhieu[i].inPhieu();
                    }
                    break;

                case 3:
                    String soPhong;
                    System.out.printf("\nNhập số phòng: ");
                    soPhong = sc.nextLine();

                    int cnt = 0;
                    for (int i = 0; i < solgPhieu; i++) {
                        if (dsPhieu[i].getPhongHocP().getSoPhong().equals(soPhong)) {
                            dsPhieu[i].inPhieu();
                            cnt++;
                        }
                    }

                    if (cnt == 0) {
                        System.out.println("Không tìm thấy phiếu cho phòng có mã: " + soPhong);
                    }
                    break;
                    
                case 4:
                    float sum = 0;
                    for (int i = 0; i < solgPhieu; i++) {
                        sum += dsPhieu[i].tongTien();
                    }
                    System.out.println("Tổng tiền la: " + sum);
                    break;
                    
                case 5:
                    System.out.printf("\nNhập số phòng: ");
                    soPhong = sc.nextLine();

                    for (int i = 0; i < solgPhieu; i++) {
                        if (dsPhieu[i].getPhongHocP().getSoPhong().equals(soPhong)) {
                            System.out.println("Tổng tiền của phòng: " + soPhong + dsPhieu[i].tongTien());
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("Thoát chương trình.");
                    //sc.close();
                    return;
                    
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy thử lại.");
                    break;
            }

        }
    }
}
