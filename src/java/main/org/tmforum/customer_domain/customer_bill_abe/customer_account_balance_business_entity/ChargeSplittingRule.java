/**
* Customer Account Balance ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.kL.cJ0L.iGE.eOK5.t.kK.x.h3QZ.g-content.html">Customer Account Balance ABE</a> 
* Used to manage account balance information. Balance (or balances) repr 
* esents an amount, usually with some monetary value, usually an aggrega 
* tion, that indicates an aspect of liability (often financial) between  
* the service provider and the account holder (usually a customer). This 
*  amount can be monetary amount, or non-monetary (such as free minutes, 
*  or amount of loyalty points), can represent credit that the CSP holds 
*  for the customer (for example pre-paid balance) or debt that the cust 
* omer owes the CSP (as is the normal case for post-paid A/R balance). R 
* elated tightly with customer payment and other ABEs especially in char 
* ing domain. It is intended to support a converged model applicable for 
*  both prepaid and postpaid cases.  
* @since SID_R16.5
*/

package org.tmforum.customer_domain.customer_bill_abe.customer_account_balance_business_entity ;

/**
* ChargeSplittingRule is charge-level/account-level rule information des 
* cribing which product charge should be directed to which CustomerAccou 
* nts. It can base on time and/or percentage.  
 @since SID_R16.5
*/ 

public  class ChargeSplittingRule  {



/**  
* Field productFinancialAccountRelationship
*/
protected List<ProductFinancialAccountRelationship> productFinancialAccountRelationship ;


}