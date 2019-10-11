//#-------------------------------------------------------------------------------
//# Copyright (C) 2019 gsergio
//# 
//# This program and the accompanying materials are made
//# available under the terms of the Eclipse Public License 2.0
//# which is available at https://www.eclipse.org/legal/epl-2.0/
//# 
//# SPDX-License-Identifier: EPL-2.0
//#-------------------------------------------------------------------------------
/*
 * generated by Xtext 2.12.0
 */
package se.gu.co4robots.xtext.promise.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import promise.Mission

@RunWith(XtextRunner)
@InjectWith(PromiseInjectorProvider)
class PromiseParsingTest {
	@Inject
	ParseHelper<Mission> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
