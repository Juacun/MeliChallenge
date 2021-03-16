package test;

import com.google.gson.Gson;
import com.squareup.okhttp.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import meli.user.Result;
import meli.user.UserPojo;

public class ClienteHttp {

    public static final OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) {

        List<String> usuariosId = new ArrayList<>();

        usuariosId.add("179571326");
        
        obtenerUsuariosPorId("MLA", usuariosId);

    }

    public static void obtenerUsuariosPorId(String siteId, List<String> sellerId) {

        for (String indice : sellerId) {

            String pathname = "LOG-userId-" + indice + ".txt";
            
            String url = "https://api.mercadolibre.com/sites/" + siteId + "/search?seller_id=" + indice.toString();
            Request request = new Request.Builder()
                    .url(url)
                    .method("GET", null)
                    .build();
            try {
                Response response = client.newCall(request).execute();
                String responseBody = response.body().string();

                Gson gson = new Gson();
                UserPojo userPojo = gson.fromJson(responseBody, UserPojo.class);

                List<Result> items = userPojo.getResults();
                
                File file = new File(pathname);
                if (!file.exists()) {
                    file.createNewFile();
                }
                BufferedWriter bw = new BufferedWriter(new FileWriter(pathname));

                int count = 0;
                for (Result item : items) {

                    count++;
                    String itemLine = item.getId() + ", " + item.getTitle() + ", " + item.getCategoryId() + ", " + item.getDomainId();
                    
                    //System.out.println(itemLine);
                    bw.write(itemLine);
                    bw.newLine();
                    
                }
                
                bw.close();
                System.out.println("Se han introducido: " + count + " Registro(s) exitosamente");
                
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }

        }

    }
}
