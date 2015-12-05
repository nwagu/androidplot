/*
 * Copyright 2012 AndroidPlot.com
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.androidplot.ui.widget;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.androidplot.exception.PlotRenderException;
import com.androidplot.ui.LayoutManager;
import com.androidplot.ui.Size;

public class EmptyWidget extends Widget {

    public EmptyWidget(LayoutManager layoutManager, Size size) {
        super(layoutManager, size);
    }
    @Override
    protected void doOnDraw(Canvas canvas, RectF widgetRect) throws PlotRenderException {
        // nothing to do
    }
}