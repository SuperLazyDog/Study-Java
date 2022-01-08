package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.util.Random;
import java.time.Instant;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVPrinter;

public class CsvTest {
    public final int ROW_NUMBER = 10;
    public final CSVFormat DEFAULT_FORMAT = CSVFormat.DEFAULT.withNullString("\\N");
    void test1() {
        String filename = get_csv_file("null_test");
        generate_data(filename, true);
        readData(filename);
//        String fileName = get_csv_file("dummy");
//        generate_data(fileName, true);
//        readData(fileName);
//        read_null();
        System.out.println(null_time());

        System.out.println(stringToValue("123", Float.class));
    }

    void read_null() {
        Integer i = null;
        System.out.println(i);
    }

    void null_test(Integer i) {
        System.out.println(i);
    }

    Instant null_time() {
        return (Instant)null;
    }

    protected String get_csv_file(String filename) {
        File dir = new File("./tmp");
        File f = new File("./tmp/"+filename+".csv");
        System.out.println(f.getAbsolutePath());
        try {
            if (!dir.exists()) {
                dir.mkdirs();
            } else {
                System.out.println("dir exists");
            }
            if (!f.exists()) {
                f.createNewFile();
            }else {
                System.out.println("file exists");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return f.getPath();
    }

    protected String get_csv_file() {
        return get_csv_file("test");
    }

    protected  void generate_data(String filepath) {
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter(filepath));
            Random random = new Random();
//            byte[] array = new byte[3];
            for (int i = 0; i < ROW_NUMBER; i++) {
                boolean bool = random.nextBoolean();
//                random.nextBytes(array);
                String str = "string,,,"+i;
                double d = random.nextDouble();
                StringBuilder record = new StringBuilder();
                record.append(bool); record.append(',');
                record.append(i); record.append(',');
                record.append(d); record.append(',');
                record.append(str);
                w.write(record.toString());
                w.newLine();
                w.flush();
            }
            w.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    protected void generate_data(String filepath, boolean byCommonsCsv) {
        if (byCommonsCsv) {
            try(CSVPrinter p = new CSVPrinter(new FileWriter(filepath), DEFAULT_FORMAT)) {
                Random random = new Random();
//                for (int i = 0; i < ROW_NUMBER; i++) {
//                    boolean bool = random.nextBoolean();
//                    String str = "string,,,"+i;
//                    double d = random.nextDouble();
//                    p.printRecord(bool, i, d, str);
//                }
                for (int i = 0; i < ROW_NUMBER; i++) {
                    p.printRecord("", null);
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        } else {
            generate_data(filepath);
        }
    }

    protected void readData(String filepath) {
        try(CSVParser parser = CSVParser.parse(new FileReader(filepath), DEFAULT_FORMAT)) {
            for (CSVRecord r : parser) {
                StringBuilder sb = new StringBuilder();
                int size = r.size();
                System.out.printf("size: %d\n", size);
                for (int i = 0; i < size; i++) {
                    String value = r.get(i);
                    sb.append(value);
                    if (value != null) {
                        System.out.println(r.get(i).getClass());
                    } else {
                        System.out.println("null");
                    }
                    if (i + 1 < size) {
                        sb.append(',');
                    }
                }
                sb.append("\n");
                System.out.println(sb.toString());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private  Object stringToValue(String origin, Class<?> obj) {
        if (obj == Boolean.class) {
            return Boolean.valueOf(origin);
        } else if (obj == Double.class) {
            return Double.valueOf(origin);
        } else if (obj == Float.class) {
            return Float.valueOf(origin);
        }
        return origin;
    }
}
