package a;

import org.apache.maven.project.MavenProject;
import org.sonatype.aether.impl.internal.CacheUtils;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;

public class Test {
	public static void main(String[] args) {
		// Artificially inducing dependencies
		MavenProject mp;
		Cache c = CacheBuilder.newBuilder().build();
		c.put(new Object(), new Object());
		System.out.println("Dummy class ...");
	}
}
