/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package mypostgres.public$.test_kunden;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Envelope extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6842777336648883157L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Envelope\",\"namespace\":\"mypostgres.public.test_kunden\",\"fields\":[{\"name\":\"before\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Value\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"int\",\"connect.default\":0},\"default\":0},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"country\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"address\",\"type\":[\"null\",\"string\"],\"default\":null}],\"connect.name\":\"mypostgres.public.test_kunden.Value\"}],\"default\":null},{\"name\":\"after\",\"type\":[\"null\",\"Value\"],\"default\":null},{\"name\":\"source\",\"type\":{\"type\":\"record\",\"name\":\"Source\",\"namespace\":\"io.debezium.connector.postgresql\",\"fields\":[{\"name\":\"version\",\"type\":\"string\"},{\"name\":\"connector\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"ts_ms\",\"type\":\"long\"},{\"name\":\"snapshot\",\"type\":[{\"type\":\"string\",\"connect.version\":1,\"connect.parameters\":{\"allowed\":\"true,last,false,incremental\"},\"connect.default\":\"false\",\"connect.name\":\"io.debezium.data.Enum\"},\"null\"],\"default\":\"false\"},{\"name\":\"db\",\"type\":\"string\"},{\"name\":\"sequence\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ts_us\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"ts_ns\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"schema\",\"type\":\"string\"},{\"name\":\"table\",\"type\":\"string\"},{\"name\":\"txId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"lsn\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"xmin\",\"type\":[\"null\",\"long\"],\"default\":null}],\"connect.name\":\"io.debezium.connector.postgresql.Source\"}},{\"name\":\"transaction\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"block\",\"namespace\":\"event\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"total_order\",\"type\":\"long\"},{\"name\":\"data_collection_order\",\"type\":\"long\"}],\"connect.version\":1,\"connect.name\":\"event.block\"}],\"default\":null},{\"name\":\"op\",\"type\":\"string\"},{\"name\":\"ts_ms\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"ts_us\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"ts_ns\",\"type\":[\"null\",\"long\"],\"default\":null}],\"connect.version\":2,\"connect.name\":\"mypostgres.public.test_kunden.Envelope\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Envelope> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Envelope> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Envelope> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Envelope> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Envelope> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Envelope to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Envelope from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Envelope instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Envelope fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  public mypostgres.public$.test_kunden.Value before;
  public mypostgres.public$.test_kunden.Value after;
  public io.debezium.connector.postgresql.Source source;
  public event.block transaction;
  public java.lang.CharSequence op;
  public java.lang.Long ts_ms;
  public java.lang.Long ts_us;
  public java.lang.Long ts_ns;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Envelope() {}

  /**
   * All-args constructor.
   * @param before The new value for before
   * @param after The new value for after
   * @param source The new value for source
   * @param transaction The new value for transaction
   * @param op The new value for op
   * @param ts_ms The new value for ts_ms
   * @param ts_us The new value for ts_us
   * @param ts_ns The new value for ts_ns
   */
  public Envelope(mypostgres.public$.test_kunden.Value before, mypostgres.public$.test_kunden.Value after, io.debezium.connector.postgresql.Source source, event.block transaction, java.lang.CharSequence op, java.lang.Long ts_ms, java.lang.Long ts_us, java.lang.Long ts_ns) {
    this.before = before;
    this.after = after;
    this.source = source;
    this.transaction = transaction;
    this.op = op;
    this.ts_ms = ts_ms;
    this.ts_us = ts_us;
    this.ts_ns = ts_ns;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return before;
    case 1: return after;
    case 2: return source;
    case 3: return transaction;
    case 4: return op;
    case 5: return ts_ms;
    case 6: return ts_us;
    case 7: return ts_ns;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: before = (mypostgres.public$.test_kunden.Value)value$; break;
    case 1: after = (mypostgres.public$.test_kunden.Value)value$; break;
    case 2: source = (io.debezium.connector.postgresql.Source)value$; break;
    case 3: transaction = (event.block)value$; break;
    case 4: op = (java.lang.CharSequence)value$; break;
    case 5: ts_ms = (java.lang.Long)value$; break;
    case 6: ts_us = (java.lang.Long)value$; break;
    case 7: ts_ns = (java.lang.Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'before' field.
   * @return The value of the 'before' field.
   */
  public mypostgres.public$.test_kunden.Value getBefore() {
    return before;
  }


  /**
   * Sets the value of the 'before' field.
   * @param value the value to set.
   */
  public void setBefore(mypostgres.public$.test_kunden.Value value) {
    this.before = value;
  }

  /**
   * Gets the value of the 'after' field.
   * @return The value of the 'after' field.
   */
  public mypostgres.public$.test_kunden.Value getAfter() {
    return after;
  }


  /**
   * Sets the value of the 'after' field.
   * @param value the value to set.
   */
  public void setAfter(mypostgres.public$.test_kunden.Value value) {
    this.after = value;
  }

  /**
   * Gets the value of the 'source' field.
   * @return The value of the 'source' field.
   */
  public io.debezium.connector.postgresql.Source getSource() {
    return source;
  }


  /**
   * Sets the value of the 'source' field.
   * @param value the value to set.
   */
  public void setSource(io.debezium.connector.postgresql.Source value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'transaction' field.
   * @return The value of the 'transaction' field.
   */
  public event.block getTransaction() {
    return transaction;
  }


  /**
   * Sets the value of the 'transaction' field.
   * @param value the value to set.
   */
  public void setTransaction(event.block value) {
    this.transaction = value;
  }

  /**
   * Gets the value of the 'op' field.
   * @return The value of the 'op' field.
   */
  public java.lang.CharSequence getOp() {
    return op;
  }


  /**
   * Sets the value of the 'op' field.
   * @param value the value to set.
   */
  public void setOp(java.lang.CharSequence value) {
    this.op = value;
  }

  /**
   * Gets the value of the 'ts_ms' field.
   * @return The value of the 'ts_ms' field.
   */
  public java.lang.Long getTsMs() {
    return ts_ms;
  }


  /**
   * Sets the value of the 'ts_ms' field.
   * @param value the value to set.
   */
  public void setTsMs(java.lang.Long value) {
    this.ts_ms = value;
  }

  /**
   * Gets the value of the 'ts_us' field.
   * @return The value of the 'ts_us' field.
   */
  public java.lang.Long getTsUs() {
    return ts_us;
  }


  /**
   * Sets the value of the 'ts_us' field.
   * @param value the value to set.
   */
  public void setTsUs(java.lang.Long value) {
    this.ts_us = value;
  }

  /**
   * Gets the value of the 'ts_ns' field.
   * @return The value of the 'ts_ns' field.
   */
  public java.lang.Long getTsNs() {
    return ts_ns;
  }


  /**
   * Sets the value of the 'ts_ns' field.
   * @param value the value to set.
   */
  public void setTsNs(java.lang.Long value) {
    this.ts_ns = value;
  }

  /**
   * Creates a new Envelope RecordBuilder.
   * @return A new Envelope RecordBuilder
   */
  public static mypostgres.public$.test_kunden.Envelope.Builder newBuilder() {
    return new mypostgres.public$.test_kunden.Envelope.Builder();
  }

  /**
   * Creates a new Envelope RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Envelope RecordBuilder
   */
  public static mypostgres.public$.test_kunden.Envelope.Builder newBuilder(mypostgres.public$.test_kunden.Envelope.Builder other) {
    if (other == null) {
      return new mypostgres.public$.test_kunden.Envelope.Builder();
    } else {
      return new mypostgres.public$.test_kunden.Envelope.Builder(other);
    }
  }

  /**
   * Creates a new Envelope RecordBuilder by copying an existing Envelope instance.
   * @param other The existing instance to copy.
   * @return A new Envelope RecordBuilder
   */
  public static mypostgres.public$.test_kunden.Envelope.Builder newBuilder(mypostgres.public$.test_kunden.Envelope other) {
    if (other == null) {
      return new mypostgres.public$.test_kunden.Envelope.Builder();
    } else {
      return new mypostgres.public$.test_kunden.Envelope.Builder(other);
    }
  }

  /**
   * RecordBuilder for Envelope instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Envelope>
    implements org.apache.avro.data.RecordBuilder<Envelope> {

    private mypostgres.public$.test_kunden.Value before;
    private mypostgres.public$.test_kunden.Value.Builder beforeBuilder;
    private mypostgres.public$.test_kunden.Value after;
    private mypostgres.public$.test_kunden.Value.Builder afterBuilder;
    private io.debezium.connector.postgresql.Source source;
    private io.debezium.connector.postgresql.Source.Builder sourceBuilder;
    private event.block transaction;
    private event.block.Builder transactionBuilder;
    private java.lang.CharSequence op;
    private java.lang.Long ts_ms;
    private java.lang.Long ts_us;
    private java.lang.Long ts_ns;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(mypostgres.public$.test_kunden.Envelope.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.before)) {
        this.before = data().deepCopy(fields()[0].schema(), other.before);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasBeforeBuilder()) {
        this.beforeBuilder = mypostgres.public$.test_kunden.Value.newBuilder(other.getBeforeBuilder());
      }
      if (isValidValue(fields()[1], other.after)) {
        this.after = data().deepCopy(fields()[1].schema(), other.after);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasAfterBuilder()) {
        this.afterBuilder = mypostgres.public$.test_kunden.Value.newBuilder(other.getAfterBuilder());
      }
      if (isValidValue(fields()[2], other.source)) {
        this.source = data().deepCopy(fields()[2].schema(), other.source);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasSourceBuilder()) {
        this.sourceBuilder = io.debezium.connector.postgresql.Source.newBuilder(other.getSourceBuilder());
      }
      if (isValidValue(fields()[3], other.transaction)) {
        this.transaction = data().deepCopy(fields()[3].schema(), other.transaction);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasTransactionBuilder()) {
        this.transactionBuilder = event.block.newBuilder(other.getTransactionBuilder());
      }
      if (isValidValue(fields()[4], other.op)) {
        this.op = data().deepCopy(fields()[4].schema(), other.op);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.ts_ms)) {
        this.ts_ms = data().deepCopy(fields()[5].schema(), other.ts_ms);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.ts_us)) {
        this.ts_us = data().deepCopy(fields()[6].schema(), other.ts_us);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.ts_ns)) {
        this.ts_ns = data().deepCopy(fields()[7].schema(), other.ts_ns);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
    }

    /**
     * Creates a Builder by copying an existing Envelope instance
     * @param other The existing instance to copy.
     */
    private Builder(mypostgres.public$.test_kunden.Envelope other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.before)) {
        this.before = data().deepCopy(fields()[0].schema(), other.before);
        fieldSetFlags()[0] = true;
      }
      this.beforeBuilder = null;
      if (isValidValue(fields()[1], other.after)) {
        this.after = data().deepCopy(fields()[1].schema(), other.after);
        fieldSetFlags()[1] = true;
      }
      this.afterBuilder = null;
      if (isValidValue(fields()[2], other.source)) {
        this.source = data().deepCopy(fields()[2].schema(), other.source);
        fieldSetFlags()[2] = true;
      }
      this.sourceBuilder = null;
      if (isValidValue(fields()[3], other.transaction)) {
        this.transaction = data().deepCopy(fields()[3].schema(), other.transaction);
        fieldSetFlags()[3] = true;
      }
      this.transactionBuilder = null;
      if (isValidValue(fields()[4], other.op)) {
        this.op = data().deepCopy(fields()[4].schema(), other.op);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.ts_ms)) {
        this.ts_ms = data().deepCopy(fields()[5].schema(), other.ts_ms);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.ts_us)) {
        this.ts_us = data().deepCopy(fields()[6].schema(), other.ts_us);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.ts_ns)) {
        this.ts_ns = data().deepCopy(fields()[7].schema(), other.ts_ns);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'before' field.
      * @return The value.
      */
    public mypostgres.public$.test_kunden.Value getBefore() {
      return before;
    }


    /**
      * Sets the value of the 'before' field.
      * @param value The value of 'before'.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder setBefore(mypostgres.public$.test_kunden.Value value) {
      validate(fields()[0], value);
      this.beforeBuilder = null;
      this.before = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'before' field has been set.
      * @return True if the 'before' field has been set, false otherwise.
      */
    public boolean hasBefore() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'before' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public mypostgres.public$.test_kunden.Value.Builder getBeforeBuilder() {
      if (beforeBuilder == null) {
        if (hasBefore()) {
          setBeforeBuilder(mypostgres.public$.test_kunden.Value.newBuilder(before));
        } else {
          setBeforeBuilder(mypostgres.public$.test_kunden.Value.newBuilder());
        }
      }
      return beforeBuilder;
    }

    /**
     * Sets the Builder instance for the 'before' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public mypostgres.public$.test_kunden.Envelope.Builder setBeforeBuilder(mypostgres.public$.test_kunden.Value.Builder value) {
      clearBefore();
      beforeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'before' field has an active Builder instance
     * @return True if the 'before' field has an active Builder instance
     */
    public boolean hasBeforeBuilder() {
      return beforeBuilder != null;
    }

    /**
      * Clears the value of the 'before' field.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder clearBefore() {
      before = null;
      beforeBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'after' field.
      * @return The value.
      */
    public mypostgres.public$.test_kunden.Value getAfter() {
      return after;
    }


    /**
      * Sets the value of the 'after' field.
      * @param value The value of 'after'.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder setAfter(mypostgres.public$.test_kunden.Value value) {
      validate(fields()[1], value);
      this.afterBuilder = null;
      this.after = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'after' field has been set.
      * @return True if the 'after' field has been set, false otherwise.
      */
    public boolean hasAfter() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'after' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public mypostgres.public$.test_kunden.Value.Builder getAfterBuilder() {
      if (afterBuilder == null) {
        if (hasAfter()) {
          setAfterBuilder(mypostgres.public$.test_kunden.Value.newBuilder(after));
        } else {
          setAfterBuilder(mypostgres.public$.test_kunden.Value.newBuilder());
        }
      }
      return afterBuilder;
    }

    /**
     * Sets the Builder instance for the 'after' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public mypostgres.public$.test_kunden.Envelope.Builder setAfterBuilder(mypostgres.public$.test_kunden.Value.Builder value) {
      clearAfter();
      afterBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'after' field has an active Builder instance
     * @return True if the 'after' field has an active Builder instance
     */
    public boolean hasAfterBuilder() {
      return afterBuilder != null;
    }

    /**
      * Clears the value of the 'after' field.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder clearAfter() {
      after = null;
      afterBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'source' field.
      * @return The value.
      */
    public io.debezium.connector.postgresql.Source getSource() {
      return source;
    }


    /**
      * Sets the value of the 'source' field.
      * @param value The value of 'source'.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder setSource(io.debezium.connector.postgresql.Source value) {
      validate(fields()[2], value);
      this.sourceBuilder = null;
      this.source = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'source' field has been set.
      * @return True if the 'source' field has been set, false otherwise.
      */
    public boolean hasSource() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'source' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.debezium.connector.postgresql.Source.Builder getSourceBuilder() {
      if (sourceBuilder == null) {
        if (hasSource()) {
          setSourceBuilder(io.debezium.connector.postgresql.Source.newBuilder(source));
        } else {
          setSourceBuilder(io.debezium.connector.postgresql.Source.newBuilder());
        }
      }
      return sourceBuilder;
    }

    /**
     * Sets the Builder instance for the 'source' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public mypostgres.public$.test_kunden.Envelope.Builder setSourceBuilder(io.debezium.connector.postgresql.Source.Builder value) {
      clearSource();
      sourceBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'source' field has an active Builder instance
     * @return True if the 'source' field has an active Builder instance
     */
    public boolean hasSourceBuilder() {
      return sourceBuilder != null;
    }

    /**
      * Clears the value of the 'source' field.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder clearSource() {
      source = null;
      sourceBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'transaction' field.
      * @return The value.
      */
    public event.block getTransaction() {
      return transaction;
    }


    /**
      * Sets the value of the 'transaction' field.
      * @param value The value of 'transaction'.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder setTransaction(event.block value) {
      validate(fields()[3], value);
      this.transactionBuilder = null;
      this.transaction = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'transaction' field has been set.
      * @return True if the 'transaction' field has been set, false otherwise.
      */
    public boolean hasTransaction() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'transaction' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public event.block.Builder getTransactionBuilder() {
      if (transactionBuilder == null) {
        if (hasTransaction()) {
          setTransactionBuilder(event.block.newBuilder(transaction));
        } else {
          setTransactionBuilder(event.block.newBuilder());
        }
      }
      return transactionBuilder;
    }

    /**
     * Sets the Builder instance for the 'transaction' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public mypostgres.public$.test_kunden.Envelope.Builder setTransactionBuilder(event.block.Builder value) {
      clearTransaction();
      transactionBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'transaction' field has an active Builder instance
     * @return True if the 'transaction' field has an active Builder instance
     */
    public boolean hasTransactionBuilder() {
      return transactionBuilder != null;
    }

    /**
      * Clears the value of the 'transaction' field.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder clearTransaction() {
      transaction = null;
      transactionBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'op' field.
      * @return The value.
      */
    public java.lang.CharSequence getOp() {
      return op;
    }


    /**
      * Sets the value of the 'op' field.
      * @param value The value of 'op'.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder setOp(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.op = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'op' field has been set.
      * @return True if the 'op' field has been set, false otherwise.
      */
    public boolean hasOp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'op' field.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder clearOp() {
      op = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'ts_ms' field.
      * @return The value.
      */
    public java.lang.Long getTsMs() {
      return ts_ms;
    }


    /**
      * Sets the value of the 'ts_ms' field.
      * @param value The value of 'ts_ms'.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder setTsMs(java.lang.Long value) {
      validate(fields()[5], value);
      this.ts_ms = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'ts_ms' field has been set.
      * @return True if the 'ts_ms' field has been set, false otherwise.
      */
    public boolean hasTsMs() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'ts_ms' field.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder clearTsMs() {
      ts_ms = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'ts_us' field.
      * @return The value.
      */
    public java.lang.Long getTsUs() {
      return ts_us;
    }


    /**
      * Sets the value of the 'ts_us' field.
      * @param value The value of 'ts_us'.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder setTsUs(java.lang.Long value) {
      validate(fields()[6], value);
      this.ts_us = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'ts_us' field has been set.
      * @return True if the 'ts_us' field has been set, false otherwise.
      */
    public boolean hasTsUs() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'ts_us' field.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder clearTsUs() {
      ts_us = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'ts_ns' field.
      * @return The value.
      */
    public java.lang.Long getTsNs() {
      return ts_ns;
    }


    /**
      * Sets the value of the 'ts_ns' field.
      * @param value The value of 'ts_ns'.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder setTsNs(java.lang.Long value) {
      validate(fields()[7], value);
      this.ts_ns = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'ts_ns' field has been set.
      * @return True if the 'ts_ns' field has been set, false otherwise.
      */
    public boolean hasTsNs() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'ts_ns' field.
      * @return This builder.
      */
    public mypostgres.public$.test_kunden.Envelope.Builder clearTsNs() {
      ts_ns = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Envelope build() {
      try {
        Envelope record = new Envelope();
        if (beforeBuilder != null) {
          try {
            record.before = this.beforeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("before"));
            throw e;
          }
        } else {
          record.before = fieldSetFlags()[0] ? this.before : (mypostgres.public$.test_kunden.Value) defaultValue(fields()[0]);
        }
        if (afterBuilder != null) {
          try {
            record.after = this.afterBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("after"));
            throw e;
          }
        } else {
          record.after = fieldSetFlags()[1] ? this.after : (mypostgres.public$.test_kunden.Value) defaultValue(fields()[1]);
        }
        if (sourceBuilder != null) {
          try {
            record.source = this.sourceBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("source"));
            throw e;
          }
        } else {
          record.source = fieldSetFlags()[2] ? this.source : (io.debezium.connector.postgresql.Source) defaultValue(fields()[2]);
        }
        if (transactionBuilder != null) {
          try {
            record.transaction = this.transactionBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("transaction"));
            throw e;
          }
        } else {
          record.transaction = fieldSetFlags()[3] ? this.transaction : (event.block) defaultValue(fields()[3]);
        }
        record.op = fieldSetFlags()[4] ? this.op : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.ts_ms = fieldSetFlags()[5] ? this.ts_ms : (java.lang.Long) defaultValue(fields()[5]);
        record.ts_us = fieldSetFlags()[6] ? this.ts_us : (java.lang.Long) defaultValue(fields()[6]);
        record.ts_ns = fieldSetFlags()[7] ? this.ts_ns : (java.lang.Long) defaultValue(fields()[7]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Envelope>
    WRITER$ = (org.apache.avro.io.DatumWriter<Envelope>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Envelope>
    READER$ = (org.apache.avro.io.DatumReader<Envelope>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.before == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.before.customEncode(out);
    }

    if (this.after == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.after.customEncode(out);
    }

    this.source.customEncode(out);

    if (this.transaction == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.transaction.customEncode(out);
    }

    out.writeString(this.op);

    if (this.ts_ms == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.ts_ms);
    }

    if (this.ts_us == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.ts_us);
    }

    if (this.ts_ns == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.ts_ns);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.before = null;
      } else {
        if (this.before == null) {
          this.before = new mypostgres.public$.test_kunden.Value();
        }
        this.before.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.after = null;
      } else {
        if (this.after == null) {
          this.after = new mypostgres.public$.test_kunden.Value();
        }
        this.after.customDecode(in);
      }

      if (this.source == null) {
        this.source = new io.debezium.connector.postgresql.Source();
      }
      this.source.customDecode(in);

      if (in.readIndex() != 1) {
        in.readNull();
        this.transaction = null;
      } else {
        if (this.transaction == null) {
          this.transaction = new event.block();
        }
        this.transaction.customDecode(in);
      }

      this.op = in.readString(this.op instanceof Utf8 ? (Utf8)this.op : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.ts_ms = null;
      } else {
        this.ts_ms = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.ts_us = null;
      } else {
        this.ts_us = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.ts_ns = null;
      } else {
        this.ts_ns = in.readLong();
      }

    } else {
      for (int i = 0; i < 8; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.before = null;
          } else {
            if (this.before == null) {
              this.before = new mypostgres.public$.test_kunden.Value();
            }
            this.before.customDecode(in);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.after = null;
          } else {
            if (this.after == null) {
              this.after = new mypostgres.public$.test_kunden.Value();
            }
            this.after.customDecode(in);
          }
          break;

        case 2:
          if (this.source == null) {
            this.source = new io.debezium.connector.postgresql.Source();
          }
          this.source.customDecode(in);
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.transaction = null;
          } else {
            if (this.transaction == null) {
              this.transaction = new event.block();
            }
            this.transaction.customDecode(in);
          }
          break;

        case 4:
          this.op = in.readString(this.op instanceof Utf8 ? (Utf8)this.op : null);
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.ts_ms = null;
          } else {
            this.ts_ms = in.readLong();
          }
          break;

        case 6:
          if (in.readIndex() != 1) {
            in.readNull();
            this.ts_us = null;
          } else {
            this.ts_us = in.readLong();
          }
          break;

        case 7:
          if (in.readIndex() != 1) {
            in.readNull();
            this.ts_ns = null;
          } else {
            this.ts_ns = in.readLong();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










