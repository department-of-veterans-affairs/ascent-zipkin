package gov.va.ascent.zipkin;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import zipkin.server.EnableZipkinServer;

@Configuration
@EnableZipkinServer
@Profile({"local-int", "default"})
public class ZipkinLocalIntConfig {
}
