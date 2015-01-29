/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class get_type_info_request extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"get_type_info_request\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"type_id\",\"type\":\"string\"},{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"semantic_type\",\"type\":\"string\"}]}");
  @Deprecated public java.lang.CharSequence type_id;
  @Deprecated public java.lang.CharSequence label;
  @Deprecated public java.lang.CharSequence semantic_type;

  /**
   * Default constructor.
   */
  public get_type_info_request() {}

  /**
   * All-args constructor.
   */
  public get_type_info_request(java.lang.CharSequence type_id, java.lang.CharSequence label, java.lang.CharSequence semantic_type) {
    this.type_id = type_id;
    this.label = label;
    this.semantic_type = semantic_type;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type_id;
    case 1: return label;
    case 2: return semantic_type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type_id = (java.lang.CharSequence)value$; break;
    case 1: label = (java.lang.CharSequence)value$; break;
    case 2: semantic_type = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type_id' field.
   */
  public java.lang.CharSequence getTypeId() {
    return type_id;
  }

  /**
   * Sets the value of the 'type_id' field.
   * @param value the value to set.
   */
  public void setTypeId(java.lang.CharSequence value) {
    this.type_id = value;
  }

  /**
   * Gets the value of the 'label' field.
   */
  public java.lang.CharSequence getLabel() {
    return label;
  }

  /**
   * Sets the value of the 'label' field.
   * @param value the value to set.
   */
  public void setLabel(java.lang.CharSequence value) {
    this.label = value;
  }

  /**
   * Gets the value of the 'semantic_type' field.
   */
  public java.lang.CharSequence getSemanticType() {
    return semantic_type;
  }

  /**
   * Sets the value of the 'semantic_type' field.
   * @param value the value to set.
   */
  public void setSemanticType(java.lang.CharSequence value) {
    this.semantic_type = value;
  }

  /** Creates a new get_type_info_request RecordBuilder */
  public static avro.java.gpudb.get_type_info_request.Builder newBuilder() {
    return new avro.java.gpudb.get_type_info_request.Builder();
  }
  
  /** Creates a new get_type_info_request RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.get_type_info_request.Builder newBuilder(avro.java.gpudb.get_type_info_request.Builder other) {
    return new avro.java.gpudb.get_type_info_request.Builder(other);
  }
  
  /** Creates a new get_type_info_request RecordBuilder by copying an existing get_type_info_request instance */
  public static avro.java.gpudb.get_type_info_request.Builder newBuilder(avro.java.gpudb.get_type_info_request other) {
    return new avro.java.gpudb.get_type_info_request.Builder(other);
  }
  
  /**
   * RecordBuilder for get_type_info_request instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<get_type_info_request>
    implements org.apache.avro.data.RecordBuilder<get_type_info_request> {

    private java.lang.CharSequence type_id;
    private java.lang.CharSequence label;
    private java.lang.CharSequence semantic_type;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.get_type_info_request.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.get_type_info_request.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing get_type_info_request instance */
    private Builder(avro.java.gpudb.get_type_info_request other) {
            super(avro.java.gpudb.get_type_info_request.SCHEMA$);
      if (isValidValue(fields()[0], other.type_id)) {
        this.type_id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.type_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.label)) {
        this.label = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.label);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.semantic_type)) {
        this.semantic_type = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.semantic_type);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'type_id' field */
    public java.lang.CharSequence getTypeId() {
      return type_id;
    }
    
    /** Sets the value of the 'type_id' field */
    public avro.java.gpudb.get_type_info_request.Builder setTypeId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.type_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'type_id' field has been set */
    public boolean hasTypeId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'type_id' field */
    public avro.java.gpudb.get_type_info_request.Builder clearTypeId() {
      type_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'label' field */
    public java.lang.CharSequence getLabel() {
      return label;
    }
    
    /** Sets the value of the 'label' field */
    public avro.java.gpudb.get_type_info_request.Builder setLabel(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.label = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'label' field has been set */
    public boolean hasLabel() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'label' field */
    public avro.java.gpudb.get_type_info_request.Builder clearLabel() {
      label = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'semantic_type' field */
    public java.lang.CharSequence getSemanticType() {
      return semantic_type;
    }
    
    /** Sets the value of the 'semantic_type' field */
    public avro.java.gpudb.get_type_info_request.Builder setSemanticType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.semantic_type = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'semantic_type' field has been set */
    public boolean hasSemanticType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'semantic_type' field */
    public avro.java.gpudb.get_type_info_request.Builder clearSemanticType() {
      semantic_type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public get_type_info_request build() {
      try {
        get_type_info_request record = new get_type_info_request();
        record.type_id = fieldSetFlags()[0] ? this.type_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.label = fieldSetFlags()[1] ? this.label : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.semantic_type = fieldSetFlags()[2] ? this.semantic_type : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
