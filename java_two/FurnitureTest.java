/**
 * Question 9: Design classes having attributes for furniture where there are
 * wooden chairs and tables, metal chairs and tables. There are stress and fire tests
 * for each product
 */
public class FurnitureTest {
    public static void main(String[] args) {
        WoodenChair woodenChair = new WoodenChair();
        woodenChair.fireTest();
        woodenChair.stressTest();
        MetallicChair metallicChair = new MetallicChair();
        metallicChair.fireTest();
        metallicChair.stressTest();
        WoodenTable woodenTable = new WoodenTable();
        woodenTable.fireTest();
        woodenTable.stressTest();
        MetallicTable metallicTable = new MetallicTable();
        metallicTable.fireTest();
        metallicTable.stressTest();
    }
}
