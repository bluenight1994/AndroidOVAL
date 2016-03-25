//
//
//****************************************************************************************//
// Copyright (c) 2002-2014, The MITRE Corporation
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without modification, are
// permitted provided that the following conditions are met:
//
//     * Redistributions of source code must retain the above copyright notice, this list
//       of conditions and the following disclaimer.
//     * Redistributions in binary form must reproduce the above copyright notice, this 
//       list of conditions and the following disclaimer in the documentation and/or other
//       materials provided with the distribution.
//     * Neither the name of The MITRE Corporation nor the names of its contributors may be
//       used to endorse or promote products derived from this software without specific 
//       prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY 
// EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
// OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT 
// SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
// OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
// HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
// TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
// EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
//
//****************************************************************************************//

package com.example.i321667.myapplication;

import org.mitre.oval.xmlSchema.xAndroidSystemCharacteristics.PasswordItemDocument.PasswordItem;
import org.mitre.oval.xmlSchema.xAndroidSystemCharacteristics.EntityItemKeyguardDisabledFeaturesType;
import android.annotation.TargetApi;
import android.app.admin.DevicePolicyManager;
import android.os.Build;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
public class JellyBeanMR1Gatherer extends ICSGatherer {
	void password(PasswordItem dai, DevicePolicyManager dpm) {
		int keyguard = dpm.getKeyguardDisabledFeatures(null);
		EntityItemKeyguardDisabledFeaturesType ei1 = EntityItemKeyguardDisabledFeaturesType.Factory.newInstance();
		if(keyguard == DevicePolicyManager.KEYGUARD_DISABLE_FEATURES_ALL) {
			ei1.setStringValue("KEYGUARD_DISABLE_FEATURES_ALL");
			dai.setKeyguardDisabledFeatures(ei1);
		} else if (keyguard == DevicePolicyManager.KEYGUARD_DISABLE_FEATURES_NONE) {
			ei1.setStringValue("KEYGUARD_DISABLE_FEATURES_NONE");
			dai.setKeyguardDisabledFeatures(ei1);
		} else if (keyguard == DevicePolicyManager.KEYGUARD_DISABLE_SECURE_CAMERA) {
			ei1.setStringValue("KEYGUARD_DISABLE_SECURE_CAMERA");
			dai.setKeyguardDisabledFeatures(ei1);
		} else if (keyguard == DevicePolicyManager.KEYGUARD_DISABLE_WIDGETS_ALL) {
			ei1.setStringValue("KEYGUARD_DISABLE_WIDGETS_ALL");
			dai.setKeyguardDisabledFeatures(ei1);
		}
	}
}
