/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gaia;  
@SuppressWarnings("all")
public class spatial_query_response extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"spatial_query_response\",\"namespace\":\"avro.java.gaia\",\"fields\":[{\"name\":\"result\",\"type\":\"boolean\"}]}");
  @Deprecated public boolean result;

  /**
   * Default constructor.
   */
  public spatial_query_response() {}

  /**
   * All-args constructor.
   */
  public spatial_query_response(java.lang.Boolean result) {
    this.result = result;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return result;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: result = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'result' field.
   */
  public java.lang.Boolean getResult() {
    return result;
  }

  /**
   * Sets the value of the 'result' field.
   * @param value the value to set.
   */
  public void setResult(java.lang.Boolean value) {
    this.result = value;
  }

  /** Creates a new spatial_query_response RecordBuilder */
  public static avro.java.gaia.spatial_query_response.Builder newBuilder() {
    return new avro.java.gaia.spatial_query_response.Builder();
  }
  
  /** Creates a new spatial_query_response RecordBuilder by copying an existing Builder */
  public static avro.java.gaia.spatial_query_response.Builder newBuilder(avro.java.gaia.spatial_query_response.Builder other) {
    return new avro.java.gaia.spatial_query_response.Builder(other);
  }
  
  /** Creates a new spatial_query_response RecordBuilder by copying an existing spatial_query_response instance */
  public static avro.java.gaia.spatial_query_response.Builder newBuilder(avro.java.gaia.spatial_query_response other) {
    return new avro.java.gaia.spatial_query_response.Builder(other);
  }
  
  /**
   * RecordBuilder for spatial_query_response instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<spatial_query_response>
    implements org.apache.avro.data.RecordBuilder<spatial_query_response> {

    private boolean result;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gaia.spatial_query_response.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gaia.spatial_query_response.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing spatial_query_response instance */
    private Builder(avro.java.gaia.spatial_query_response other) {
            super(avro.java.gaia.spatial_query_response.SCHEMA$);
      if (isValidValue(fields()[0], other.result)) {
        this.result = (java.lang.Boolean) data().deepCopy(fields()[0].schema(), other.result);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'result' field */
    public java.lang.Boolean getResult() {
      return result;
    }
    
    /** Sets the value of the 'result' field */
    public avro.java.gaia.spatial_query_response.Builder setResult(boolean value) {
      validate(fields()[0], value);
      this.result = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'result' field has been set */
    public boolean hasResult() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'result' field */
    public avro.java.gaia.spatial_query_response.Builder clearResult() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public spatial_query_response build() {
      try {
        spatial_query_response record = new spatial_query_response();
        record.result = fieldSetFlags()[0] ? this.result : (java.lang.Boolean) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}