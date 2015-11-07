/**
 * This class is generated by jOOQ
 */
package io.github.picodotdev.blogbitix.multidatabase.jooq.purchases;


import io.github.picodotdev.blogbitix.multidatabase.jooq.inventory.tables.records.ItemRecord;
import io.github.picodotdev.blogbitix.multidatabase.jooq.purchases.tables.Purchase;
import io.github.picodotdev.blogbitix.multidatabase.jooq.purchases.tables.records.PurchaseRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>PURCHASES</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<PurchaseRecord, Long> IDENTITY_PURCHASE = Identities0.IDENTITY_PURCHASE;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<PurchaseRecord> PK_PURCHASE = UniqueKeys0.PK_PURCHASE;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<PurchaseRecord, ItemRecord> ITEM_ID = ForeignKeys0.ITEM_ID;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<PurchaseRecord, Long> IDENTITY_PURCHASE = createIdentity(Purchase.PURCHASE, Purchase.PURCHASE.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<PurchaseRecord> PK_PURCHASE = createUniqueKey(Purchase.PURCHASE, Purchase.PURCHASE.ID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<PurchaseRecord, ItemRecord> ITEM_ID = createForeignKey(io.github.picodotdev.blogbitix.multidatabase.jooq.inventory.Keys.PK_ITEM, Purchase.PURCHASE, Purchase.PURCHASE.ITEM_ID);
	}
}