package com.example.swagger;

import io.swagger.v3.core.converter.AnnotatedType;
import io.swagger.v3.core.converter.ModelConverters;
import io.swagger.v3.core.converter.ResolvedSchema;
import io.swagger.v3.oas.models.media.Schema;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTests {

	@Test
	void schemaExample() {
		ResolvedSchema resolvedSchema = ModelConverters.getInstance()
				.resolveAsResolvedSchema(new AnnotatedType(TestData.class));

		Schema<?> testDataSchema = resolvedSchema.referencedSchemas.get("TestData");
		Schema<?> idSchema = testDataSchema.getProperties().get("id");
		assertThat(idSchema.getExampleSetFlag()).isTrue();
	}

}
