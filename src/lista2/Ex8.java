/*
 * Copyright (C) 2024 Willian Junior <willianjunior.c.f@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package lista2;
import java.util.Scanner;

/**
 *
 * @author Willian Junior <willianjunior.c.f@gmail.com>
 * @date 03/03/2024
 * @brief Class Ex8
 */

public class Ex8 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira os valores de A e B");
        
        int A = ler.nextInt(), B = ler.nextInt(), maior;
        
        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
        
        System.out.println((A > B) ? "Valor de B e maior que o de A" : "Valor de A e maior que o de B");
        
    }
}
