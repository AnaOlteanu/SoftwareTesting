package pachet2;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import pachet1.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class MyClassTest {

    MyClass tester = new MyClass();

    @Test
    public void equivalencePartitioning() throws IOException {

        File actual_file = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\src\\pachet1\\licentaOut.txt");
        ///c_1111
        File f1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_input\\input1.txt");
        tester.gaseste_interval(f1);
        File expected_file1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_expected\\expected1.txt");
        //assertTrue("The files are different!", FileUtils.contentEquals(expected_file1, actual_file));
        Assert.assertEquals(FileUtils.readLines(expected_file1), FileUtils.readLines(actual_file));


        ///c_1112
        File f2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_input\\input2.txt");
        tester.gaseste_interval(f2);
        File expected_file2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_expected\\expected2.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file2, actual_file));

        ///c_2
        File f3 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_input\\input3.txt");
        tester.gaseste_interval(f3);
        File expected_file3 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_expected\\expected3.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file3, actual_file));

        ///c_3
        File f4 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_input\\input4.txt");
        tester.gaseste_interval(f4);
        File expected_file4 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_expected\\expected4.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file4, actual_file));

        ///c_12
        File f5 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_input\\input5.txt");
        tester.gaseste_interval(f5);
        File expected_file5 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_expected\\expected5.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file5, actual_file));

        //c_13
        File f6 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_input\\input6.txt");
        tester.gaseste_interval(f6);
        File expected_file6 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_expected\\expected6.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file6, actual_file));

        //c_112
        File f7 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_input\\input7.txt");
        tester.gaseste_interval(f7);
        File expected_file7 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_expected\\expected7.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file7, actual_file));

        //c_113
        File f8 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_input\\input8.txt");
        tester.gaseste_interval(f8);
        File expected_file8 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\EP_expected\\expected8.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file8, actual_file));
    }


    @Test
    public void boundaryValueAnalysis() throws IOException {
        File actual_file = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\src\\pachet1\\licentaOut.txt");
        //1
        File f1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input1.txt");
        tester.gaseste_interval(f1);
        File expected_file1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected1.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file1, actual_file));

        //2
        File f2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input2.txt");
        tester.gaseste_interval(f2);
        File expected_file2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected2.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file2, actual_file));

        //3
        File f3 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input3.txt");
        tester.gaseste_interval(f3);
        File expected_file3 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected3.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file3, actual_file));

        //4
        File f4 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input4.txt");
        tester.gaseste_interval(f4);
        File expected_file4 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected4.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file4, actual_file));

        //5
        File f5 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input5.txt");
        tester.gaseste_interval(f5);
        File expected_file5 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected5.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file5, actual_file));

        //6
        File f6 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input6.txt");
        tester.gaseste_interval(f6);
        File expected_file6 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected6.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file6, actual_file));

        //7
        File f7 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input7.txt");
        tester.gaseste_interval(f7);
        File expected_file7 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected7.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file7, actual_file));

        //8
        File f8 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input8.txt");
        tester.gaseste_interval(f8);
        File expected_file8 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected8.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file8, actual_file));

        //9
        File f9 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input9.txt");
        tester.gaseste_interval(f9);
        File expected_file9 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected9.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file9, actual_file));

        //10
        File f10 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input10.txt");
        tester.gaseste_interval(f10);
        File expected_file10 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected10.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file10, actual_file));

        //11
        File f11 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input11.txt");
        tester.gaseste_interval(f11);
        File expected_file11 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected11.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file11, actual_file));

        //12
        File f12 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input12.txt");
        tester.gaseste_interval(f12);
        File expected_file12 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected12.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file12, actual_file));

        //13
        File f13 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input13.txt");
        tester.gaseste_interval(f13);
        File expected_file13 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected13.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file13, actual_file));

        //14
        File f14 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input14.txt");
        tester.gaseste_interval(f14);
        File expected_file14 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected14.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file14, actual_file));

        //15
        File f15 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input15.txt");
        tester.gaseste_interval(f15);
        File expected_file15 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected15.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file15, actual_file));

        //16
        File f16 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input16.txt");
        tester.gaseste_interval(f16);
        File expected_file16 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected16.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file16, actual_file));

        //17
        File f17 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input17.txt");
        tester.gaseste_interval(f17);
        File expected_file17 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected17.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file17, actual_file));

        //18
        File f18 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input18.txt");
        tester.gaseste_interval(f18);
        File expected_file18 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected18.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file18, actual_file));

        //19
        File f19 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input19.txt");
        tester.gaseste_interval(f19);
        File expected_file19 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected19.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file19, actual_file));

        //20
        File f20 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input20.txt");
        tester.gaseste_interval(f20);
        File expected_file20 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected20.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file20, actual_file));

        //21
        File f21 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input21.txt");
        tester.gaseste_interval(f21);
        File expected_file21 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected21.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file21, actual_file));

        //22
        File f22 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input22.txt");
        tester.gaseste_interval(f22);
        File expected_file22 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected22.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file22, actual_file));

        //23
        File f23 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input23.txt");
        tester.gaseste_interval(f23);
        File expected_file23 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected23.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file23, actual_file));

        //24
        File f24 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input24.txt");
        tester.gaseste_interval(f24);
        File expected_file24 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected24.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file24, actual_file));

        //25
        File f25 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input25.txt");
        tester.gaseste_interval(f25);
        File expected_file25 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected25.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file25, actual_file));

        //26
        File f26 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input26.txt");
        tester.gaseste_interval(f26);
        File expected_file26 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected26.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file26, actual_file));

        //27
        File f27 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input27.txt");
        tester.gaseste_interval(f27);
        File expected_file27 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected27.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file27, actual_file));

        //28
        File f28 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input28.txt");
        tester.gaseste_interval(f28);
        File expected_file28 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected28.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file28, actual_file));

        //29
        File f29 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input29.txt");
        tester.gaseste_interval(f29);
        File expected_file29 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected29.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file29, actual_file));

        //30
        File f30 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_input\\input30.txt");
        tester.gaseste_interval(f30);
        File expected_file30 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\BA_expected\\expected30.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file30, actual_file));

    }

    @Test
    public void categoryPartitioning() throws IOException {
        File actual_file = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\src\\pachet1\\licentaOut.txt");
        //1
        File f1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input1.txt");
        tester.gaseste_interval(f1);
        File expected_file1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected1.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file1, actual_file));

        //2
        File f2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input2.txt");
        tester.gaseste_interval(f2);
        File expected_file2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected2.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file2, actual_file));

        //3
        File f3 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input3.txt");
        tester.gaseste_interval(f3);
        File expected_file3 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected3.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file3, actual_file));

        //4
        File f4 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input4.txt");
        tester.gaseste_interval(f4);
        File expected_file4 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected4.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file4, actual_file));

        //5
        File f5 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input5.txt");
        tester.gaseste_interval(f5);
        File expected_file5 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected5.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file5, actual_file));

        //6
        File f6 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input6.txt");
        tester.gaseste_interval(f6);
        File expected_file6 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected6.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file6, actual_file));

        //7
        File f7 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input7.txt");
        tester.gaseste_interval(f7);
        File expected_file7 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected7.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file7, actual_file));

        //8
        File f8 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input8.txt");
        tester.gaseste_interval(f8);
        File expected_file8 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected8.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file8, actual_file));

        //9
        File f9 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input9.txt");
        tester.gaseste_interval(f9);
        File expected_file9 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected9.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file9, actual_file));

        //10
        File f10 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input10.txt");
        tester.gaseste_interval(f10);
        File expected_file10 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected10.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file10, actual_file));

        //11
        File f11 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input11.txt");
        tester.gaseste_interval(f11);
        File expected_file11 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected11.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file11, actual_file));

        //12
        File f12 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input12.txt");
        tester.gaseste_interval(f12);
        File expected_file12 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected12.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file12, actual_file));

        //13
        File f13 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input13.txt");
        tester.gaseste_interval(f13);
        File expected_file13 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected13.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file13, actual_file));

        //14
        File f14 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input14.txt");
        tester.gaseste_interval(f14);
        File expected_file14 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected14.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file14, actual_file));

        //15
        File f15 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input15.txt");
        tester.gaseste_interval(f15);
        File expected_file15 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected15.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file15, actual_file));

        //16
        File f16 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_input\\input16.txt");
        tester.gaseste_interval(f16);
        File expected_file16 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CP_expected\\expected16.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file16, actual_file));


    }

    @Test
    public void statementCoverage() throws IOException {
        File actual_file = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\src\\pachet1\\licentaOut.txt");

        //1
        File f1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\SC_input\\input1.txt");
        tester.gaseste_interval(f1);
        File expected_file1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\SC_expected\\expected1.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file1, actual_file));

        //2
        File f2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\SC_input\\input2.txt");
        tester.gaseste_interval(f2);
        File expected_file2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\SC_expected\\expected2.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file2, actual_file));

    }

    @Test
    public void decisionCoverage() throws IOException {
        File actual_file = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\src\\pachet1\\licentaOut.txt");

        //1
        File f1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_input\\input1.txt");
        tester.gaseste_interval(f1);
        File expected_file1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_expected\\expected1.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file1, actual_file));

        //2
        File f2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_input\\input2.txt");
        tester.gaseste_interval(f2);
        File expected_file2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_expected\\expected2.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file2, actual_file));

        //3
        File f3 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_input\\input3.txt");
        tester.gaseste_interval(f3);
        File expected_file3 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_expected\\expected3.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file3, actual_file));

        //4
        File f4 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_input\\input4.txt");
        tester.gaseste_interval(f4);
        File expected_file4 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_expected\\expected4.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file4, actual_file));

        //5
        File f5 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_input\\input5.txt");
        tester.gaseste_interval(f5);
        File expected_file5 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_expected\\expected5.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file5, actual_file));

        //6
        File f6 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_input\\input6.txt");
        tester.gaseste_interval(f6);
        File expected_file6 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_expected\\expected6.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file6, actual_file));

        //7
        File f7 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_input\\input7.txt");
        tester.gaseste_interval(f7);
        File expected_file7 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_expected\\expected7.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file7, actual_file));

        //8
        File f8 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_input\\input8.txt");
        tester.gaseste_interval(f8);
        File expected_file8 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\DC_expected\\expected8.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file8, actual_file));

    }

    @Test
    public void conditionCoverage() throws IOException {
        File actual_file = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\src\\pachet1\\licentaOut.txt");

        //1
        File f1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_input\\input1.txt");
        tester.gaseste_interval(f1);
        File expected_file1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_expected\\expected1.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file1, actual_file));

        //2
        File f2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_input\\input2.txt");
        tester.gaseste_interval(f2);
        File expected_file2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_expected\\expected2.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file2, actual_file));

        //3
        File f3 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_input\\input3.txt");
        tester.gaseste_interval(f3);
        File expected_file3 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_expected\\expected3.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file3, actual_file));

        //4
        File f4 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_input\\input4.txt");
        tester.gaseste_interval(f4);
        File expected_file4 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_expected\\expected4.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file4, actual_file));

        //5
        File f5 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_input\\input5.txt");
        tester.gaseste_interval(f5);
        File expected_file5 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_expected\\expected5.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file5, actual_file));

        //6
        File f6 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_input\\input6.txt");
        tester.gaseste_interval(f6);
        File expected_file6 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_expected\\expected6.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file6, actual_file));

        //7
        File f7 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_input\\input7.txt");
        tester.gaseste_interval(f7);
        File expected_file7 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_expected\\expected7.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file7, actual_file));

        //8
        File f8 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_input\\input8.txt");
        tester.gaseste_interval(f8);
        File expected_file8 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_expected\\expected8.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file8, actual_file));

        //9
        File f9 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_input\\input9.txt");
        tester.gaseste_interval(f9);
        File expected_file9 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_expected\\expected9.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file9, actual_file));

        //10
        File f10 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_input\\input10.txt");
        tester.gaseste_interval(f10);
        File expected_file10 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_expected\\expected10.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file10, actual_file));

        //11
        File f11 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_input\\input11.txt");
        tester.gaseste_interval(f11);
        File expected_file11 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\CC_expected\\expected11.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file11, actual_file));

    }

    @Test
    public void killMutants() throws IOException {
        File actual_file = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\src\\pachet1\\licentaOut.txt");

        //1
        File f1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\Mutant_input\\input1.txt");
        tester.gaseste_interval(f1);
        File expected_file1 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\Mutant_expected\\expected1.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file1, actual_file));

        //2
        File f2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\Mutant_input\\input2.txt");
        tester.gaseste_interval(f2);
        File expected_file2 = new File("D:\\An 3\\SEM 2\\Testare software\\PROIECT\\tests\\pachet2\\Mutant_expected\\expected2.txt");
        assertTrue("The files are different!", FileUtils.contentEquals(expected_file2, actual_file));

    }

}