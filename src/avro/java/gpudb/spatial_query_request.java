/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class spatial_query_request extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"spatial_query_request\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"wkt_string_1\",\"type\":\"string\"},{\"name\":\"wkt_string_2\",\"type\":\"string\"},{\"name\":\"operation\",\"type\":\"string\"}]}");
  @Deprecated public java.lang.CharSequence wkt_string_1;
  @Deprecated public java.lang.CharSequence wkt_string_2;
  @Deprecated public java.lang.CharSequence operation;

  /**
   * Default constructor.
   */
  public spatial_query_request() {}

  /**
   * All-args constructor.
   */
  public spatial_query_request(java.lang.CharSequence wkt_string_1, java.lang.CharSequence wkt_string_2, java.lang.CharSequence operation) {
    this.wkt_string_1 = wkt_string_1;
    this.wkt_string_2 = wkt_string_2;
    this.operation = operation;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return wkt_string_1;
    case 1: return wkt_string_2;
    case 2: return operation;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: wkt_string_1 = (java.lang.CharSequence)value$; break;
    case 1: wkt_string_2 = (java.lang.CharSequence)value$; break;
    case 2: operation = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'wkt_string_1' field.
   */
  public java.lang.CharSequence getWktString1() {
    return wkt_string_1;
  }

  /**
   * Sets the value of the 'wkt_string_1' field.
   * @param value the value to set.
   */
  public void setWktString1(java.lang.CharSequence value) {
    this.wkt_string_1 = value;
  }

  /**
   * Gets the value of the 'wkt_string_2' field.
   */
  public java.lang.CharSequence getWktString2() {
    return wkt_string_2;
  }

  /**
   * Sets the value of the 'wkt_string_2' field.
   * @param value the value to set.
   */
  public void setWktString2(java.lang.CharSequence value) {
    this.wkt_string_2 = value;
  }

  /**
   * Gets the value of the 'operation' field.
   */
  public java.lang.CharSequence getOperation() {
    return operation;
  }

  /**
   * Sets the value of the 'operation' field.
   * @param value the value to set.
   */
  public void setOperation(java.lang.CharSequence value) {
    this.operation = value;
  }

  /** Creates a new spatial_query_request RecordBuilder */
  public static avro.java.gpudb.spatial_query_request.Builder newBuilder() {
    return new avro.java.gpudb.spatial_query_request.Builder();
  }
  
  /** Creates a new spatial_query_request RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.spatial_query_request.Builder newBuilder(avro.java.gpudb.spatial_query_request.Builder other) {
    return new avro.java.gpudb.spatial_query_request.Builder(other);
  }
  
  /** Creates a new spatial_query_request RecordBuilder by copying an existing spatial_query_request instance */
  public static avro.java.gpudb.spatial_query_request.Builder newBuilder(avro.java.gpudb.spatial_query_request other) {
    return new avro.java.gpudb.spatial_query_request.Builder(other);
  }
  
  /**
   * RecordBuilder for spatial_query_request instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<spatial_query_request>
    implements org.apache.avro.data.RecordBuilder<spatial_query_request> {

    private java.lang.CharSequence wkt_string_1;
    private java.lang.CharSequence wkt_string_2;
    private java.lang.CharSequence operation;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.spatial_query_request.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.spatial_query_request.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing spatial_query_request instance */
    private Builder(avro.java.gpudb.spatial_query_request other) {
            super(avro.java.gpudb.spatial_query_request.SCHEMA$);
      if (isValidValue(fields()[0], other.wkt_string_1)) {
        this.wkt_string_1 = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.wkt_string_1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.wkt_string_2)) {
        this.wkt_string_2 = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.wkt_string_2);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.operation)) {
        this.operation = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.operation);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'wkt_string_1' field */
    public java.lang.CharSequence getWktString1() {
      return wkt_string_1;
    }
    
    /** Sets the value of the 'wkt_string_1' field */
    public avro.java.gpudb.spatial_query_request.Builder setWktString1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.wkt_string_1 = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'wkt_string_1' field has been set */
    public boolean hasWktString1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'wkt_string_1' field */
    public avro.java.gpudb.spatial_query_request.Builder clearWktString1() {
      wkt_string_1 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'wkt_string_2' field */
    public java.lang.CharSequence getWktString2() {
      return wkt_string_2;
    }
    
    /** Sets the value of the 'wkt_string_2' field */
    public avro.java.gpudb.spatial_query_request.Builder setWktString2(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.wkt_string_2 = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'wkt_string_2' field has been set */
    public boolean hasWktString2() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'wkt_string_2' field */
    public avro.java.gpudb.spatial_query_request.Builder clearWktString2() {
      wkt_string_2 = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'operation' field */
    public java.lang.CharSequence getOperation() {
      return operation;
    }
    
    /** Sets the value of the 'operation' field */
    public avro.java.gpudb.spatial_query_request.Builder setOperation(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.operation = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'operation' field has been set */
    public boolean hasOperation() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'operation' field */
    public avro.java.gpudb.spatial_query_request.Builder clearOperation() {
      operation = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public spatial_query_request build() {
      try {
        spatial_query_request record = new spatial_query_request();
        record.wkt_string_1 = fieldSetFlags()[0] ? this.wkt_string_1 : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.wkt_string_2 = fieldSetFlags()[1] ? this.wkt_string_2 : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.operation = fieldSetFlags()[2] ? this.operation : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
