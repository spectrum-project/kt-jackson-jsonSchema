package com.kjetland.jackson.jsonSchema.testDataKotlin

import com.dr.ktjsonschema.annotations.JsonSchemaDefault

data class PojoWithParentKotlin
(
  var pojoValue:Boolean,
  var child:ParentKotlin,

  @JsonSchemaDefault("x")
  var stringWithDefault:String,
  @JsonSchemaDefault("12")
  var intWithDefault:Int,
  @JsonSchemaDefault("true")
  var booleanWithDefault:Boolean
)
