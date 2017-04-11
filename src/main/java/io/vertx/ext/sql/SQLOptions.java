package io.vertx.ext.sql;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true)
public class SQLOptions {

  // connection
  private boolean autoCommit;
  private boolean readOnly;
  private String catalog;
  private TransactionIsolation transactionIsolation;
  private ResultSetType resultSetType;
  private ResultSetConcurrency resultSetConcurrency;
  private boolean autoGeneratedKeys;
  private String schema;
  // statement
  private int queryTimeout;
  // resultset
  private FetchDirection fetchDirection;
  private int fetchSize;

  /**
   * Default constructor
   */
  public SQLOptions() {
  }

  /**
   * Copy constructor
   *
   * @param other  the result to copy
   */
  public SQLOptions(SQLOptions other) {
    this.autoCommit = other.isAutoCommit();
    this.readOnly = other.isReadOnly();
    this.catalog = other.getCatalog();
    this.transactionIsolation = other.getTransactionIsolation();
    this.resultSetType = other.getResultSetType();
    this.resultSetConcurrency = other.getResultSetConcurrency();
    this.autoGeneratedKeys = other.isAutoGeneratedKeys();
    this.schema = other.getSchema();
    this.queryTimeout = other.getQueryTimeout();
    this.fetchDirection = other.getFetchDirection();
    this.fetchSize = other.getFetchSize();
  }

  /**
   * Constructor from JSON
   *
   * @param json  the json
   */
  public SQLOptions(JsonObject json) {
    SQLOptionsConverter.fromJson(json, this);
  }

  public boolean isAutoCommit() {
    return autoCommit;
  }

  public SQLOptions setAutoCommit(boolean autoCommit) {
    this.autoCommit = autoCommit;
    return this;
  }

  public boolean isReadOnly() {
    return readOnly;
  }

  public SQLOptions setReadOnly(boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  public String getCatalog() {
    return catalog;
  }

  public SQLOptions setCatalog(String catalog) {
    this.catalog = catalog;
    return this;
  }

  public TransactionIsolation getTransactionIsolation() {
    return transactionIsolation;
  }

  public SQLOptions setTransactionIsolation(TransactionIsolation transactionIsolation) {
    this.transactionIsolation = transactionIsolation;
    return this;
  }

  public ResultSetType getResultSetType() {
    return resultSetType;
  }

  public SQLOptions setResultSetType(ResultSetType resultSetType) {
    this.resultSetType = resultSetType;
    return this;
  }

  public ResultSetConcurrency getResultSetConcurrency() {
    return resultSetConcurrency;
  }

  public SQLOptions setResultSetConcurrency(ResultSetConcurrency resultSetConcurrency) {
    this.resultSetConcurrency = resultSetConcurrency;
    return this;
  }

  public boolean isAutoGeneratedKeys() {
    return autoGeneratedKeys;
  }

  public SQLOptions setAutoGeneratedKeys(boolean autoGeneratedKeys) {
    this.autoGeneratedKeys = autoGeneratedKeys;
    return this;
  }

  public String getSchema() {
    return schema;
  }

  public SQLOptions setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  public FetchDirection getFetchDirection() {
    return fetchDirection;
  }

  public SQLOptions setFetchDirection(FetchDirection fetchDirection) {
    this.fetchDirection = fetchDirection;
    return this;
  }

  public int getFetchSize() {
    return fetchSize;
  }

  public SQLOptions setFetchSize(int fetchSize) {
    this.fetchSize = fetchSize;
    return this;
  }

  public int getQueryTimeout() {
    return queryTimeout;
  }

  public SQLOptions setQueryTimeout(int queryTimeout) {
    this.queryTimeout = queryTimeout;
    return this;
  }
}
