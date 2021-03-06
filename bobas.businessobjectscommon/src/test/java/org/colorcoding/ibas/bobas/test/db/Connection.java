package org.colorcoding.ibas.bobas.test.db;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.RowIdLifetime;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.Executor;

/**
 * 代理-测试用
 * 
 * @author Niuren.Zhu
 *
 */
class Connection implements java.sql.Connection {
	public Connection(String dbURL, String dbUser) {
		this.url = dbURL;
		this.user = dbUser;
	}

	private String user;
	private String url;

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return false;
	}

	@Override
	public java.sql.Statement createStatement() throws SQLException {
		return new Statement();
	}

	@Override
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public CallableStatement prepareCall(String sql) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public String nativeSQL(String sql) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setAutoCommit(boolean autoCommit) throws SQLException {
	}

	@Override
	public boolean getAutoCommit() throws SQLException {
		return false;
	}

	@Override
	public void commit() throws SQLException {
		try {
			Thread.sleep((new Random().nextInt(3000)));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rollback() throws SQLException {
	}

	@Override
	public void close() throws SQLException {
	}

	@Override
	public boolean isClosed() throws SQLException {
		return false;
	}

	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		return new DatabaseMetaData() {
			@Override
			public <T> T unwrap(Class<T> iface) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				return false;
			}

			@Override
			public boolean allProceduresAreCallable() throws SQLException {
				return false;
			}

			@Override
			public boolean allTablesAreSelectable() throws SQLException {
				return false;
			}

			@Override
			public String getURL() throws SQLException {
				return url;
			}

			@Override
			public String getUserName() throws SQLException {
				return user;
			}

			@Override
			public boolean isReadOnly() throws SQLException {
				return false;
			}

			@Override
			public boolean nullsAreSortedHigh() throws SQLException {
				return false;
			}

			@Override
			public boolean nullsAreSortedLow() throws SQLException {
				return false;
			}

			@Override
			public boolean nullsAreSortedAtStart() throws SQLException {
				return false;
			}

			@Override
			public boolean nullsAreSortedAtEnd() throws SQLException {
				return false;
			}

			@Override
			public String getDatabaseProductName() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getDatabaseProductVersion() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getDriverName() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getDriverVersion() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public int getDriverMajorVersion() {
				return 0;
			}

			@Override
			public int getDriverMinorVersion() {
				return 0;
			}

			@Override
			public boolean usesLocalFiles() throws SQLException {
				return false;
			}

			@Override
			public boolean usesLocalFilePerTable() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsMixedCaseIdentifiers() throws SQLException {
				return false;
			}

			@Override
			public boolean storesUpperCaseIdentifiers() throws SQLException {
				return false;
			}

			@Override
			public boolean storesLowerCaseIdentifiers() throws SQLException {
				return false;
			}

			@Override
			public boolean storesMixedCaseIdentifiers() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsMixedCaseQuotedIdentifiers() throws SQLException {
				return false;
			}

			@Override
			public boolean storesUpperCaseQuotedIdentifiers() throws SQLException {
				return false;
			}

			@Override
			public boolean storesLowerCaseQuotedIdentifiers() throws SQLException {
				return false;
			}

			@Override
			public boolean storesMixedCaseQuotedIdentifiers() throws SQLException {
				return false;
			}

			@Override
			public String getIdentifierQuoteString() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getSQLKeywords() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getNumericFunctions() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getStringFunctions() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getSystemFunctions() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getTimeDateFunctions() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getSearchStringEscape() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getExtraNameCharacters() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean supportsAlterTableWithAddColumn() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsAlterTableWithDropColumn() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsColumnAliasing() throws SQLException {
				return false;
			}

			@Override
			public boolean nullPlusNonNullIsNull() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsConvert() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsConvert(int fromType, int toType) throws SQLException {
				return false;
			}

			@Override
			public boolean supportsTableCorrelationNames() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsDifferentTableCorrelationNames() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsExpressionsInOrderBy() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsOrderByUnrelated() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsGroupBy() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsGroupByUnrelated() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsGroupByBeyondSelect() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsLikeEscapeClause() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsMultipleResultSets() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsMultipleTransactions() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsNonNullableColumns() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsMinimumSQLGrammar() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsCoreSQLGrammar() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsExtendedSQLGrammar() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsANSI92EntryLevelSQL() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsANSI92IntermediateSQL() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsANSI92FullSQL() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsIntegrityEnhancementFacility() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsOuterJoins() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsFullOuterJoins() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsLimitedOuterJoins() throws SQLException {
				return false;
			}

			@Override
			public String getSchemaTerm() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getProcedureTerm() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public String getCatalogTerm() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean isCatalogAtStart() throws SQLException {
				return false;
			}

			@Override
			public String getCatalogSeparator() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean supportsSchemasInDataManipulation() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsSchemasInProcedureCalls() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsSchemasInTableDefinitions() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsSchemasInIndexDefinitions() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsSchemasInPrivilegeDefinitions() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsCatalogsInDataManipulation() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsCatalogsInProcedureCalls() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsCatalogsInTableDefinitions() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsCatalogsInIndexDefinitions() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsPositionedDelete() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsPositionedUpdate() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsSelectForUpdate() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsStoredProcedures() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsSubqueriesInComparisons() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsSubqueriesInExists() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsSubqueriesInIns() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsSubqueriesInQuantifieds() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsCorrelatedSubqueries() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsUnion() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsUnionAll() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsOpenCursorsAcrossCommit() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsOpenCursorsAcrossRollback() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsOpenStatementsAcrossCommit() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsOpenStatementsAcrossRollback() throws SQLException {
				return false;
			}

			@Override
			public int getMaxBinaryLiteralLength() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxCharLiteralLength() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxColumnNameLength() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxColumnsInGroupBy() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxColumnsInIndex() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxColumnsInOrderBy() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxColumnsInSelect() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxColumnsInTable() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxConnections() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxCursorNameLength() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxIndexLength() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxSchemaNameLength() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxProcedureNameLength() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxCatalogNameLength() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxRowSize() throws SQLException {
				return 0;
			}

			@Override
			public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
				return false;
			}

			@Override
			public int getMaxStatementLength() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxStatements() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxTableNameLength() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxTablesInSelect() throws SQLException {
				return 0;
			}

			@Override
			public int getMaxUserNameLength() throws SQLException {
				return 0;
			}

			@Override
			public int getDefaultTransactionIsolation() throws SQLException {
				return 0;
			}

			@Override
			public boolean supportsTransactions() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsTransactionIsolationLevel(int level) throws SQLException {
				return false;
			}

			@Override
			public boolean supportsDataDefinitionAndDataManipulationTransactions() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsDataManipulationTransactionsOnly() throws SQLException {
				return false;
			}

			@Override
			public boolean dataDefinitionCausesTransactionCommit() throws SQLException {
				return false;
			}

			@Override
			public boolean dataDefinitionIgnoredInTransactions() throws SQLException {
				return false;
			}

			@Override
			public ResultSet getProcedures(String catalog, String schemaPattern, String procedureNamePattern)
					throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getProcedureColumns(String catalog, String schemaPattern, String procedureNamePattern,
					String columnNamePattern) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types)
					throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getSchemas() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getCatalogs() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getTableTypes() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getColumns(String catalog, String schemaPattern, String tableNamePattern,
					String columnNamePattern) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getColumnPrivileges(String catalog, String schema, String table, String columnNamePattern)
					throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getTablePrivileges(String catalog, String schemaPattern, String tableNamePattern)
					throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getBestRowIdentifier(String catalog, String schema, String table, int scope,
					boolean nullable) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getVersionColumns(String catalog, String schema, String table) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getPrimaryKeys(String catalog, String schema, String table) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getImportedKeys(String catalog, String schema, String table) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getExportedKeys(String catalog, String schema, String table) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getCrossReference(String parentCatalog, String parentSchema, String parentTable,
					String foreignCatalog, String foreignSchema, String foreignTable) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getTypeInfo() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getIndexInfo(String catalog, String schema, String table, boolean unique,
					boolean approximate) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean supportsResultSetType(int type) throws SQLException {
				return false;
			}

			@Override
			public boolean supportsResultSetConcurrency(int type, int concurrency) throws SQLException {
				return false;
			}

			@Override
			public boolean ownUpdatesAreVisible(int type) throws SQLException {
				return false;
			}

			@Override
			public boolean ownDeletesAreVisible(int type) throws SQLException {
				return false;
			}

			@Override
			public boolean ownInsertsAreVisible(int type) throws SQLException {
				return false;
			}

			@Override
			public boolean othersUpdatesAreVisible(int type) throws SQLException {
				return false;
			}

			@Override
			public boolean othersDeletesAreVisible(int type) throws SQLException {
				return false;
			}

			@Override
			public boolean othersInsertsAreVisible(int type) throws SQLException {
				return false;
			}

			@Override
			public boolean updatesAreDetected(int type) throws SQLException {
				return false;
			}

			@Override
			public boolean deletesAreDetected(int type) throws SQLException {
				return false;
			}

			@Override
			public boolean insertsAreDetected(int type) throws SQLException {
				return false;
			}

			@Override
			public boolean supportsBatchUpdates() throws SQLException {
				return false;
			}

			@Override
			public ResultSet getUDTs(String catalog, String schemaPattern, String typeNamePattern, int[] types)
					throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public java.sql.Connection getConnection() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean supportsSavepoints() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsNamedParameters() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsMultipleOpenResults() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsGetGeneratedKeys() throws SQLException {
				return false;
			}

			@Override
			public ResultSet getSuperTypes(String catalog, String schemaPattern, String typeNamePattern)
					throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getSuperTables(String catalog, String schemaPattern, String tableNamePattern)
					throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getAttributes(String catalog, String schemaPattern, String typeNamePattern,
					String attributeNamePattern) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean supportsResultSetHoldability(int holdability) throws SQLException {
				return false;
			}

			@Override
			public int getResultSetHoldability() throws SQLException {
				return 0;
			}

			@Override
			public int getDatabaseMajorVersion() throws SQLException {
				return 0;
			}

			@Override
			public int getDatabaseMinorVersion() throws SQLException {
				return 0;
			}

			@Override
			public int getJDBCMajorVersion() throws SQLException {
				return 0;
			}

			@Override
			public int getJDBCMinorVersion() throws SQLException {
				return 0;
			}

			@Override
			public int getSQLStateType() throws SQLException {
				return 0;
			}

			@Override
			public boolean locatorsUpdateCopy() throws SQLException {
				return false;
			}

			@Override
			public boolean supportsStatementPooling() throws SQLException {
				return false;
			}

			@Override
			public RowIdLifetime getRowIdLifetime() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getSchemas(String catalog, String schemaPattern) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean supportsStoredFunctionsUsingCallSyntax() throws SQLException {
				return false;
			}

			@Override
			public boolean autoCommitFailureClosesAllResultSets() throws SQLException {
				return false;
			}

			@Override
			public ResultSet getClientInfoProperties() throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getFunctions(String catalog, String schemaPattern, String functionNamePattern)
					throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getFunctionColumns(String catalog, String schemaPattern, String functionNamePattern,
					String columnNamePattern) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public ResultSet getPseudoColumns(String catalog, String schemaPattern, String tableNamePattern,
					String columnNamePattern) throws SQLException {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean generatedKeyAlwaysReturned() throws SQLException {
				return false;
			}
		};
	}

	@Override
	public void setReadOnly(boolean readOnly) throws SQLException {
	}

	@Override
	public boolean isReadOnly() throws SQLException {
		return false;
	}

	@Override
	public void setCatalog(String catalog) throws SQLException {
	}

	@Override
	public String getCatalog() throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setTransactionIsolation(int level) throws SQLException {
	}

	@Override
	public int getTransactionIsolation() throws SQLException {
		return 0;
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clearWarnings() throws SQLException {
	}

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
			throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
	}

	@Override
	public void setHoldability(int holdability) throws SQLException {
	}

	@Override
	public int getHoldability() throws SQLException {
		return 0;
	}

	@Override
	public Savepoint setSavepoint() throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public Savepoint setSavepoint(String name) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void rollback(Savepoint savepoint) throws SQLException {
	}

	@Override
	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
	}

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
			int resultSetHoldability) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
			int resultSetHoldability) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public Clob createClob() throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public Blob createBlob() throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public NClob createNClob() throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public SQLXML createSQLXML() throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isValid(int timeout) throws SQLException {
		return false;
	}

	@Override
	public void setClientInfo(String name, String value) throws SQLClientInfoException {
	}

	@Override
	public void setClientInfo(Properties properties) throws SQLClientInfoException {
	}

	@Override
	public String getClientInfo(String name) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public Properties getClientInfo() throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setSchema(String schema) throws SQLException {
	}

	@Override
	public String getSchema() throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void abort(Executor executor) throws SQLException {
	}

	@Override
	public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
	}

	@Override
	public int getNetworkTimeout() throws SQLException {
		return 0;
	}
}