package org.springframework.boot.metadata.test.metadatatest;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/**
 * @author Artem Bilan
 */
@ConfigurationProperties("my")
@Validated
public class MyProperties {

	private String foo;

	private String bar;

	@NotEmpty
	public String getFoo() {
		return this.foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}

}
