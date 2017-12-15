/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clinton.paiva
 */
import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
	

//Define variables
def count=0
def file ="C:\\wamp\\www\\GIT\\Patch330\\ui\\test\\data\\treefield.json"

//Reading the JSON file
def inputJson=new JsonSlurper().parseText(new File(file).getText())

//Get total count of subcomponent columns and print subcomponent column that contains A
def var=9925
inputJson.MS_WRK_TREEFIELD."$var".each{count++}.each{
		println it
}.each.println "Total Subcomponents " + count


