package gov.va.ascent.zipkin;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import zipkin.server.EnableZipkinServer;
import gov.va.ascent.framework.config.AscentCommonSpringProfiles;

@Configuration
@EnableZipkinServer
@Profile({AscentCommonSpringProfiles.PROFILE_ENV_LOCAL_INT, AscentCommonSpringProfiles.PROFILE_DEFAULT})
public class ZipkinLocalIntConfig {
}
