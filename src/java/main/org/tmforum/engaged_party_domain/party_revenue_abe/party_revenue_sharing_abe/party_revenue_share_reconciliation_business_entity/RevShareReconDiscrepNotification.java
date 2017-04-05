/**
* Party Revenue Share Reconciliation ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.q.f.n.rUEK5E.e.a.m.lL.c.v.q.v7Y.pA-content.html">Party Revenue Share Reconciliation ABE</a> 
* The Party Revenue Sharing Reconciliation ABE ensures that two sets of  
* party revenue sharing records are aligned and agreed upon. For example 
* , an enterprise may receive an invoice from another party that is comp 
* ared to the revenue share that has been determined to be shared with t 
* he party contained in the Party Revenue Share ABE.Reconciliation inclu 
* des comparing what is received with what is to be paid, invoiced or cr 
* edited/debited to an bill/invoice or account balance, identifying and  
* resolving discrepancies, identifying adjustments to revenue to be shar 
* ed, and tracking discrepancy resolution. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_revenue_sharing_abe.party_revenue_share_reconciliation_business_entity ;

/**
* A communication from another party that  initiates the party revenue s 
* haring reconciliation process. The communication contains  information 
*  used in the process from another party. The information used in the r 
* econciliation is provided on a revenue sharing notice, bill/invoice, o 
* r payment according to terms specified by a party revenue sharing agre 
* ement. For example a party may provide their own version of a party re 
* venue share for one or more of its product offerings.The information p 
* rovided is designated as preliminary until the reconciliation is compl 
* ete. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class RevShareReconDiscrepNotification extends BusinessInteraction {



/**  
* Field partyRevShareReconDiscrepancy
*/
protected PartyRevShareReconDiscrepancy partyRevShareReconDiscrepancy ;


}