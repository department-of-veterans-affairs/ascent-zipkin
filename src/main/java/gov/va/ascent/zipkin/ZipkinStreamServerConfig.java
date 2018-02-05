package gov.va.ascent.zipkin;

import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import gov.va.ascent.framework.config.AscentCommonSpringProfiles;

@Configuration
@EnableZipkinStreamServer
@Profile({ AscentCommonSpringProfiles.PROFILE_ENV_DOCKER_DEMO, AscentCommonSpringProfiles.PROFILE_ENV_AWS_CI,
		AscentCommonSpringProfiles.PROFILE_ENV_AWS_STAGE, AscentCommonSpringProfiles.PROFILE_ENV_AWS_PROD })
public class ZipkinStreamServerConfig {
}
