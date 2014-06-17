/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gaia;  
@SuppressWarnings("all")
public class group_by_map_page_response extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"group_by_map_page_response\",\"namespace\":\"avro.java.gaia\",\"fields\":[{\"name\":\"count_map\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"string\"}}},{\"name\":\"parent_set_id\",\"type\":\"string\"}]}");
  @Deprecated public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> count_map;
  @Deprecated public java.lang.CharSequence parent_set_id;

  /**
   * Default constructor.
   */
  public group_by_map_page_response() {}

  /**
   * All-args constructor.
   */
  public group_by_map_page_response(java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> count_map, java.lang.CharSequence parent_set_id) {
    this.count_map = count_map;
    this.parent_set_id = parent_set_id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return count_map;
    case 1: return parent_set_id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: count_map = (java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>>)value$; break;
    case 1: parent_set_id = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'count_map' field.
   */
  public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> getCountMap() {
    return count_map;
  }

  /**
   * Sets the value of the 'count_map' field.
   * @param value the value to set.
   */
  public void setCountMap(java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> value) {
    this.count_map = value;
  }

  /**
   * Gets the value of the 'parent_set_id' field.
   */
  public java.lang.CharSequence getParentSetId() {
    return parent_set_id;
  }

  /**
   * Sets the value of the 'parent_set_id' field.
   * @param value the value to set.
   */
  public void setParentSetId(java.lang.CharSequence value) {
    this.parent_set_id = value;
  }

  /** Creates a new group_by_map_page_response RecordBuilder */
  public static avro.java.gaia.group_by_map_page_response.Builder newBuilder() {
    return new avro.java.gaia.group_by_map_page_response.Builder();
  }
  
  /** Creates a new group_by_map_page_response RecordBuilder by copying an existing Builder */
  public static avro.java.gaia.group_by_map_page_response.Builder newBuilder(avro.java.gaia.group_by_map_page_response.Builder other) {
    return new avro.java.gaia.group_by_map_page_response.Builder(other);
  }
  
  /** Creates a new group_by_map_page_response RecordBuilder by copying an existing group_by_map_page_response instance */
  public static avro.java.gaia.group_by_map_page_response.Builder newBuilder(avro.java.gaia.group_by_map_page_response other) {
    return new avro.java.gaia.group_by_map_page_response.Builder(other);
  }
  
  /**
   * RecordBuilder for group_by_map_page_response instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<group_by_map_page_response>
    implements org.apache.avro.data.RecordBuilder<group_by_map_page_response> {

    private java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> count_map;
    private java.lang.CharSequence parent_set_id;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gaia.group_by_map_page_response.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gaia.group_by_map_page_response.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing group_by_map_page_response instance */
    private Builder(avro.java.gaia.group_by_map_page_response other) {
            super(avro.java.gaia.group_by_map_page_response.SCHEMA$);
      if (isValidValue(fields()[0], other.count_map)) {
        this.count_map = (java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>>) data().deepCopy(fields()[0].schema(), other.count_map);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.parent_set_id)) {
        this.parent_set_id = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.parent_set_id);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'count_map' field */
    public java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> getCountMap() {
      return count_map;
    }
    
    /** Sets the value of the 'count_map' field */
    public avro.java.gaia.group_by_map_page_response.Builder setCountMap(java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>> value) {
      validate(fields()[0], value);
      this.count_map = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'count_map' field has been set */
    public boolean hasCountMap() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'count_map' field */
    public avro.java.gaia.group_by_map_page_response.Builder clearCountMap() {
      count_map = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'parent_set_id' field */
    public java.lang.CharSequence getParentSetId() {
      return parent_set_id;
    }
    
    /** Sets the value of the 'parent_set_id' field */
    public avro.java.gaia.group_by_map_page_response.Builder setParentSetId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.parent_set_id = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'parent_set_id' field has been set */
    public boolean hasParentSetId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'parent_set_id' field */
    public avro.java.gaia.group_by_map_page_response.Builder clearParentSetId() {
      parent_set_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public group_by_map_page_response build() {
      try {
        group_by_map_page_response record = new group_by_map_page_response();
        record.count_map = fieldSetFlags()[0] ? this.count_map : (java.util.Map<java.lang.CharSequence,java.util.List<java.lang.CharSequence>>) defaultValue(fields()[0]);
        record.parent_set_id = fieldSetFlags()[1] ? this.parent_set_id : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}