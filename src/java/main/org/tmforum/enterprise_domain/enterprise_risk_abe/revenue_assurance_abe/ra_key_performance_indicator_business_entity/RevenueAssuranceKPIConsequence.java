/**
* RA Key Performance Indicator ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E94300F9010392-content.html">RA Key Performance Indicator ABE</a> 
* KeyPerformanceIndicators and RAObjectives that may trigger the creatio 
* n of a RATroubleTicket. KeyPerformanceIndicator are defined on RAViola 
* tions, and on other Revenue Assurance related entities, such as Custom 
* erBills and CallDetailRecords. 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.revenue_assurance_abe.ra_key_performance_indicator_business_entity ;

/**
* An action taken if a RevenueAssuranceObjective is not met for a Revenu 
* eAssuranceKPI. 

Inheritance tree: |- 
 SID Models::Enterprise Domain::Enterprise Risk ABE::Revenue Assurance ABE::RA Control ABE::RevenueAssuranceConsequence @since SID_R16.5
*/ 

public  class RevenueAssuranceKPIConsequence extends RevenueAssuranceConsequence {



/**  
* Field revenueAssuranceTroubleTicketSpec
*/
protected List<RevenueAssuranceTroubleTicketSpec> revenueAssuranceTroubleTicketSpec ;


}