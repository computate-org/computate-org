package {{ PROJECT_JAVA_PACKAGE }}.java;

import java.io.IOException;
import java.time.ZonedDateTime;

import {{ PROJECT_JAVA_PACKAGE }}.page.PageLayout;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class ZonedDateTimeSerializer extends JsonSerializer<ZonedDateTime> {

	@Override()
	public void  serialize(ZonedDateTime o, JsonGenerator generator, SerializerProvider provider) throws IOException, IOException {
		generator.writeString(PageLayout.FORMATZonedDateTimeDisplay.format(o));
	}
}
