package com.robin.blog;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.io.IOException;
import org.apache.http.util.EntityUtils;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Spider {

    private CloseableHttpClient client;

    /**
     * 测试HttpClient
     */
    @Test
    public  void testSpider(){
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet("https://www.yuque.com/api/v2/repos/306952/docs/1727231");
        CloseableHttpResponse response = null;
        try {
            response=client.execute(httpGet);
            HttpEntity entity =response.getEntity();
            System.out.println(EntityUtils.toString(entity));
            System.out.println(response.getStatusLine());
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
