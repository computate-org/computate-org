package {{ PROJECT_JAVA_PACKAGE }}.java;

import java.io.IOException;
import java.time.LocalDate;

import {{ PROJECT_JAVA_PACKAGE }}.page.PageLayout;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class LocalDateSerializer extends JsonSerializer<LocalDate> {

	@Override()
	public void  serialize(LocalDate o, JsonGenerator generator, SerializerProvider provider) throws IOException, IOException {
		generator.writeString(PageLayout.FORMATDateDisplay.format(o));
	}
}
