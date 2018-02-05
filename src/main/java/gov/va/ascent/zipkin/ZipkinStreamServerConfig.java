package gov.va.ascent.zipkin;

import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableZipkinStreamServer
@Profile({"docker-demo", "aws-ci", "aws-stage", "aws-prod"})
public class ZipkinStreamServerConfig {
}
