/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package avro.java.gpudb;  
@SuppressWarnings("all")
public class bulk_update_request extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"bulk_update_request\",\"namespace\":\"avro.java.gpudb\",\"fields\":[{\"name\":\"set_id\",\"type\":\"string\"},{\"name\":\"global_expression\",\"type\":\"string\"},{\"name\":\"expressions\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"new_values_maps\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":\"string\"}}},{\"name\":\"objects_to_insert\",\"type\":{\"type\":\"array\",\"items\":\"bytes\"}},{\"name\":\"objects_to_insert_str\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"object_encoding\",\"type\":\"string\"},{\"name\":\"params\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"user_auth_string\",\"type\":\"string\"}]}");
  @Deprecated public java.lang.CharSequence set_id;
  @Deprecated public java.lang.CharSequence global_expression;
  @Deprecated public java.util.List<java.lang.CharSequence> expressions;
  @Deprecated public java.util.List<java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> new_values_maps;
  @Deprecated public java.util.List<java.nio.ByteBuffer> objects_to_insert;
  @Deprecated public java.util.List<java.lang.CharSequence> objects_to_insert_str;
  @Deprecated public java.lang.CharSequence object_encoding;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> params;
  @Deprecated public java.lang.CharSequence user_auth_string;

  /**
   * Default constructor.
   */
  public bulk_update_request() {}

  /**
   * All-args constructor.
   */
  public bulk_update_request(java.lang.CharSequence set_id, java.lang.CharSequence global_expression, java.util.List<java.lang.CharSequence> expressions, java.util.List<java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> new_values_maps, java.util.List<java.nio.ByteBuffer> objects_to_insert, java.util.List<java.lang.CharSequence> objects_to_insert_str, java.lang.CharSequence object_encoding, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> params, java.lang.CharSequence user_auth_string) {
    this.set_id = set_id;
    this.global_expression = global_expression;
    this.expressions = expressions;
    this.new_values_maps = new_values_maps;
    this.objects_to_insert = objects_to_insert;
    this.objects_to_insert_str = objects_to_insert_str;
    this.object_encoding = object_encoding;
    this.params = params;
    this.user_auth_string = user_auth_string;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return set_id;
    case 1: return global_expression;
    case 2: return expressions;
    case 3: return new_values_maps;
    case 4: return objects_to_insert;
    case 5: return objects_to_insert_str;
    case 6: return object_encoding;
    case 7: return params;
    case 8: return user_auth_string;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: set_id = (java.lang.CharSequence)value$; break;
    case 1: global_expression = (java.lang.CharSequence)value$; break;
    case 2: expressions = (java.util.List<java.lang.CharSequence>)value$; break;
    case 3: new_values_maps = (java.util.List<java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>)value$; break;
    case 4: objects_to_insert = (java.util.List<java.nio.ByteBuffer>)value$; break;
    case 5: objects_to_insert_str = (java.util.List<java.lang.CharSequence>)value$; break;
    case 6: object_encoding = (java.lang.CharSequence)value$; break;
    case 7: params = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 8: user_auth_string = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'set_id' field.
   */
  public java.lang.CharSequence getSetId() {
    return set_id;
  }

  /**
   * Sets the value of the 'set_id' field.
   * @param value the value to set.
   */
  public void setSetId(java.lang.CharSequence value) {
    this.set_id = value;
  }

  /**
   * Gets the value of the 'global_expression' field.
   */
  public java.lang.CharSequence getGlobalExpression() {
    return global_expression;
  }

  /**
   * Sets the value of the 'global_expression' field.
   * @param value the value to set.
   */
  public void setGlobalExpression(java.lang.CharSequence value) {
    this.global_expression = value;
  }

  /**
   * Gets the value of the 'expressions' field.
   */
  public java.util.List<java.lang.CharSequence> getExpressions() {
    return expressions;
  }

  /**
   * Sets the value of the 'expressions' field.
   * @param value the value to set.
   */
  public void setExpressions(java.util.List<java.lang.CharSequence> value) {
    this.expressions = value;
  }

  /**
   * Gets the value of the 'new_values_maps' field.
   */
  public java.util.List<java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> getNewValuesMaps() {
    return new_values_maps;
  }

  /**
   * Sets the value of the 'new_values_maps' field.
   * @param value the value to set.
   */
  public void setNewValuesMaps(java.util.List<java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> value) {
    this.new_values_maps = value;
  }

  /**
   * Gets the value of the 'objects_to_insert' field.
   */
  public java.util.List<java.nio.ByteBuffer> getObjectsToInsert() {
    return objects_to_insert;
  }

  /**
   * Sets the value of the 'objects_to_insert' field.
   * @param value the value to set.
   */
  public void setObjectsToInsert(java.util.List<java.nio.ByteBuffer> value) {
    this.objects_to_insert = value;
  }

  /**
   * Gets the value of the 'objects_to_insert_str' field.
   */
  public java.util.List<java.lang.CharSequence> getObjectsToInsertStr() {
    return objects_to_insert_str;
  }

  /**
   * Sets the value of the 'objects_to_insert_str' field.
   * @param value the value to set.
   */
  public void setObjectsToInsertStr(java.util.List<java.lang.CharSequence> value) {
    this.objects_to_insert_str = value;
  }

  /**
   * Gets the value of the 'object_encoding' field.
   */
  public java.lang.CharSequence getObjectEncoding() {
    return object_encoding;
  }

  /**
   * Sets the value of the 'object_encoding' field.
   * @param value the value to set.
   */
  public void setObjectEncoding(java.lang.CharSequence value) {
    this.object_encoding = value;
  }

  /**
   * Gets the value of the 'params' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getParams() {
    return params;
  }

  /**
   * Sets the value of the 'params' field.
   * @param value the value to set.
   */
  public void setParams(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.params = value;
  }

  /**
   * Gets the value of the 'user_auth_string' field.
   */
  public java.lang.CharSequence getUserAuthString() {
    return user_auth_string;
  }

  /**
   * Sets the value of the 'user_auth_string' field.
   * @param value the value to set.
   */
  public void setUserAuthString(java.lang.CharSequence value) {
    this.user_auth_string = value;
  }

  /** Creates a new bulk_update_request RecordBuilder */
  public static avro.java.gpudb.bulk_update_request.Builder newBuilder() {
    return new avro.java.gpudb.bulk_update_request.Builder();
  }
  
  /** Creates a new bulk_update_request RecordBuilder by copying an existing Builder */
  public static avro.java.gpudb.bulk_update_request.Builder newBuilder(avro.java.gpudb.bulk_update_request.Builder other) {
    return new avro.java.gpudb.bulk_update_request.Builder(other);
  }
  
  /** Creates a new bulk_update_request RecordBuilder by copying an existing bulk_update_request instance */
  public static avro.java.gpudb.bulk_update_request.Builder newBuilder(avro.java.gpudb.bulk_update_request other) {
    return new avro.java.gpudb.bulk_update_request.Builder(other);
  }
  
  /**
   * RecordBuilder for bulk_update_request instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<bulk_update_request>
    implements org.apache.avro.data.RecordBuilder<bulk_update_request> {

    private java.lang.CharSequence set_id;
    private java.lang.CharSequence global_expression;
    private java.util.List<java.lang.CharSequence> expressions;
    private java.util.List<java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> new_values_maps;
    private java.util.List<java.nio.ByteBuffer> objects_to_insert;
    private java.util.List<java.lang.CharSequence> objects_to_insert_str;
    private java.lang.CharSequence object_encoding;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> params;
    private java.lang.CharSequence user_auth_string;

    /** Creates a new Builder */
    private Builder() {
      super(avro.java.gpudb.bulk_update_request.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(avro.java.gpudb.bulk_update_request.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing bulk_update_request instance */
    private Builder(avro.java.gpudb.bulk_update_request other) {
            super(avro.java.gpudb.bulk_update_request.SCHEMA$);
      if (isValidValue(fields()[0], other.set_id)) {
        this.set_id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.set_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.global_expression)) {
        this.global_expression = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.global_expression);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.expressions)) {
        this.expressions = (java.util.List<java.lang.CharSequence>) data().deepCopy(fields()[2].schema(), other.expressions);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.new_values_maps)) {
        this.new_values_maps = (java.util.List<java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>) data().deepCopy(fields()[3].schema(), other.new_values_maps);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.objects_to_insert)) {
        this.objects_to_insert = (java.util.List<java.nio.ByteBuffer>) data().deepCopy(fields()[4].schema(), other.objects_to_insert);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.objects_to_insert_str)) {
        this.objects_to_insert_str = (java.util.List<java.lang.CharSequence>) data().deepCopy(fields()[5].schema(), other.objects_to_insert_str);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.object_encoding)) {
        this.object_encoding = (java.lang.CharSequence) data().deepCopy(fields()[6].schema(), other.object_encoding);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.params)) {
        this.params = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) data().deepCopy(fields()[7].schema(), other.params);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.user_auth_string)) {
        this.user_auth_string = (java.lang.CharSequence) data().deepCopy(fields()[8].schema(), other.user_auth_string);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'set_id' field */
    public java.lang.CharSequence getSetId() {
      return set_id;
    }
    
    /** Sets the value of the 'set_id' field */
    public avro.java.gpudb.bulk_update_request.Builder setSetId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.set_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'set_id' field has been set */
    public boolean hasSetId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'set_id' field */
    public avro.java.gpudb.bulk_update_request.Builder clearSetId() {
      set_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'global_expression' field */
    public java.lang.CharSequence getGlobalExpression() {
      return global_expression;
    }
    
    /** Sets the value of the 'global_expression' field */
    public avro.java.gpudb.bulk_update_request.Builder setGlobalExpression(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.global_expression = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'global_expression' field has been set */
    public boolean hasGlobalExpression() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'global_expression' field */
    public avro.java.gpudb.bulk_update_request.Builder clearGlobalExpression() {
      global_expression = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'expressions' field */
    public java.util.List<java.lang.CharSequence> getExpressions() {
      return expressions;
    }
    
    /** Sets the value of the 'expressions' field */
    public avro.java.gpudb.bulk_update_request.Builder setExpressions(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.expressions = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'expressions' field has been set */
    public boolean hasExpressions() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'expressions' field */
    public avro.java.gpudb.bulk_update_request.Builder clearExpressions() {
      expressions = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'new_values_maps' field */
    public java.util.List<java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> getNewValuesMaps() {
      return new_values_maps;
    }
    
    /** Sets the value of the 'new_values_maps' field */
    public avro.java.gpudb.bulk_update_request.Builder setNewValuesMaps(java.util.List<java.util.Map<java.lang.CharSequence,java.lang.CharSequence>> value) {
      validate(fields()[3], value);
      this.new_values_maps = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'new_values_maps' field has been set */
    public boolean hasNewValuesMaps() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'new_values_maps' field */
    public avro.java.gpudb.bulk_update_request.Builder clearNewValuesMaps() {
      new_values_maps = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'objects_to_insert' field */
    public java.util.List<java.nio.ByteBuffer> getObjectsToInsert() {
      return objects_to_insert;
    }
    
    /** Sets the value of the 'objects_to_insert' field */
    public avro.java.gpudb.bulk_update_request.Builder setObjectsToInsert(java.util.List<java.nio.ByteBuffer> value) {
      validate(fields()[4], value);
      this.objects_to_insert = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'objects_to_insert' field has been set */
    public boolean hasObjectsToInsert() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'objects_to_insert' field */
    public avro.java.gpudb.bulk_update_request.Builder clearObjectsToInsert() {
      objects_to_insert = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'objects_to_insert_str' field */
    public java.util.List<java.lang.CharSequence> getObjectsToInsertStr() {
      return objects_to_insert_str;
    }
    
    /** Sets the value of the 'objects_to_insert_str' field */
    public avro.java.gpudb.bulk_update_request.Builder setObjectsToInsertStr(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[5], value);
      this.objects_to_insert_str = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'objects_to_insert_str' field has been set */
    public boolean hasObjectsToInsertStr() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'objects_to_insert_str' field */
    public avro.java.gpudb.bulk_update_request.Builder clearObjectsToInsertStr() {
      objects_to_insert_str = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'object_encoding' field */
    public java.lang.CharSequence getObjectEncoding() {
      return object_encoding;
    }
    
    /** Sets the value of the 'object_encoding' field */
    public avro.java.gpudb.bulk_update_request.Builder setObjectEncoding(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.object_encoding = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'object_encoding' field has been set */
    public boolean hasObjectEncoding() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'object_encoding' field */
    public avro.java.gpudb.bulk_update_request.Builder clearObjectEncoding() {
      object_encoding = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'params' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getParams() {
      return params;
    }
    
    /** Sets the value of the 'params' field */
    public avro.java.gpudb.bulk_update_request.Builder setParams(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[7], value);
      this.params = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'params' field has been set */
    public boolean hasParams() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'params' field */
    public avro.java.gpudb.bulk_update_request.Builder clearParams() {
      params = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'user_auth_string' field */
    public java.lang.CharSequence getUserAuthString() {
      return user_auth_string;
    }
    
    /** Sets the value of the 'user_auth_string' field */
    public avro.java.gpudb.bulk_update_request.Builder setUserAuthString(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.user_auth_string = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'user_auth_string' field has been set */
    public boolean hasUserAuthString() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'user_auth_string' field */
    public avro.java.gpudb.bulk_update_request.Builder clearUserAuthString() {
      user_auth_string = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public bulk_update_request build() {
      try {
        bulk_update_request record = new bulk_update_request();
        record.set_id = fieldSetFlags()[0] ? this.set_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.global_expression = fieldSetFlags()[1] ? this.global_expression : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.expressions = fieldSetFlags()[2] ? this.expressions : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[2]);
        record.new_values_maps = fieldSetFlags()[3] ? this.new_values_maps : (java.util.List<java.util.Map<java.lang.CharSequence,java.lang.CharSequence>>) defaultValue(fields()[3]);
        record.objects_to_insert = fieldSetFlags()[4] ? this.objects_to_insert : (java.util.List<java.nio.ByteBuffer>) defaultValue(fields()[4]);
        record.objects_to_insert_str = fieldSetFlags()[5] ? this.objects_to_insert_str : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[5]);
        record.object_encoding = fieldSetFlags()[6] ? this.object_encoding : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.params = fieldSetFlags()[7] ? this.params : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[7]);
        record.user_auth_string = fieldSetFlags()[8] ? this.user_auth_string : (java.lang.CharSequence) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
