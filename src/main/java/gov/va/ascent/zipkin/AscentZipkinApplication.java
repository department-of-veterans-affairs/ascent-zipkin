package gov.va.ascent.zipkin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.metrics.export.prometheus.EnablePrometheusMetrics;

@SpringBootApplication
@EnableZipkinStreamServer
@EnableDiscoveryClient
@EnablePrometheusMetrics
public class AscentZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(AscentZipkinApplication.class, args);
    }
}
