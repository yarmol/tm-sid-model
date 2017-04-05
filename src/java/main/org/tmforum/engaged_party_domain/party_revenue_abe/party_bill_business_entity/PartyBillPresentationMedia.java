/**
* Party Bill ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.e.bI.sE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Bill ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_business_entity ;

/**
* A means of communicating a PartyBill, supported by the associated bill 
*  format. For example, post mail, email, web page. 
 @since SID_R16.5
*/ 

public  class PartyBillPresentationMedia  {



/**  
* Field name
* A short descriptive name. 

*/
protected String name ;




/**  
* Field description
* A description of the presentation media. 

*/
protected String description ;




/**  
* Field partyBillFormat
*/
protected List<PartyBillFormat> partyBillFormat ;


}