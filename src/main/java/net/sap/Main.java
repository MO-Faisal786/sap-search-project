package net.sap;

public class Main {

    private static final String CREATE_TABLE_SQL_TEMPLATE = "CREATE TABLE IF NOT EXISTS %s (id INT AUTO_INCREMENT PRIMARY KEY, %s_value VARCHAR(255))";
    private static final String INSERT_DATA_SQL_TEMPLATE = "INSERT INTO %s (%s_value) VALUES (?)"; // ? - placeholder for data
    public static void main(String[] args) {
        // try {
        //     String jsonData = new String(Files.readAllBytes(Paths.get("C:\\Users\\user\\OneDrive\\Desktop\\JSON.txt")));
        //     ObjectMapper objectMapper = new ObjectMapper();
        //     Map<String, Map<String, ArrayList<Map<String, Object>>>> jsonMap = objectMapper.readValue(jsonData, Map.class);
        //     jsonMap
        //     .forEach((key, value) -> {
        //         System.out.println("================"+key+"================");
        //         value.forEach((k, v) -> {
        //             System.out.println("================"+k+"================");
        //             for(Map<String, Object> e : v){
        //                 e.forEach((kk, vv) -> {
        //                     if(kk.equals("__metadata")){
                                
        //                     } else {
        //                         System.out.println(String.format(CREATE_TABLE_SQL_TEMPLATE, kk, kk));
        //                         System.out.println(String.format(INSERT_DATA_SQL_TEMPLATE, kk, kk));
        //                     }
        //                 });
        //                 System.out.println("==========================");
        //             }
        //         });
        //     });
            
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        // String tableName = "mtart";
        // System.out.println(String.format(CREATE_TABLE_SQL_TEMPLATE, tableName, tableName));
        // System.out.println(String.format(INSERT_DATA_SQL_TEMPLATE, tableName, tableName));
        // String simpleName = Mtart.class.getSimpleName();
        // System.out.println(simpleName);
    }
}