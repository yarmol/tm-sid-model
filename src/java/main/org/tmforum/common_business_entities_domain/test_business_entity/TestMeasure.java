/**
* Test ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_CN2.cED6.jE.eS.l.f7G.uC.b7.u.hA-content.html">Test ABE</a> 
* A test is a function performed on a product, service, or resource that 
*  results in measures being produced that reflect the functioning of th 
* e entity under test. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.test_business_entity ;

/**
* A value that is collected during the execution of a product, service,  
* or resource test, based on a TestMeasureDefinition. It provides a prec 
* ise value at a given point in time, or span of time, that is considere 
* d to be the result(s) of executing of the test.  

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Metric ABE::Metric Measure ABE::MetricMeasure @since SID_R16.5
*/ 

public  class TestMeasure extends MetricMeasure {



/**  
* Field test
*/
protected Test test ;


}