package com.google.samples.apps.sunflower.plantdetail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.google.samples.apps.sunflower.R

@Composable
fun PlantWatering(wateringInterval: Int, modifier: Modifier = Modifier) {
    MaterialTheme {
        val normalPadding = dimensionResource(R.dimen.margin_normal)
        Column(
            modifier
                .fillMaxWidth()
                .padding(vertical = normalPadding)) {
            val centerWithPaddingModifier = Modifier
                .padding(horizontal = dimensionResource(R.dimen.margin_small))
                .align(Alignment.CenterHorizontally)

            Text(
                text = stringResource(id = R.string.watering_needs_prefix),
                modifier = centerWithPaddingModifier,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colors.primaryVariant
            )

            val wateringIntervalText = pluralStringResource(
                R.plurals.watering_needs_suffix, wateringInterval, wateringInterval
            )
            Text(
                text = wateringIntervalText,
                modifier = centerWithPaddingModifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PlantWateringPreview() {
    PlantWatering(wateringInterval = 3)
}