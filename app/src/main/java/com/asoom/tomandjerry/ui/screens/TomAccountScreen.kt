package com.asoom.tomandjerry.ui.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asoom.tomandjerry.R
import com.asoom.tomandjerry.ui.screens.models.TomSettingsModel
import com.asoom.tomandjerry.ui.theme.BackgroundBinkColor
import com.asoom.tomandjerry.ui.theme.BackgroundGreenColor
import com.asoom.tomandjerry.ui.theme.BackgroundWhiteColor
import com.asoom.tomandjerry.ui.theme.BackgroundYellowColor
import com.asoom.tomandjerry.ui.theme.BorderGrayColor
import com.asoom.tomandjerry.ui.theme.LightBabyBlueColor
import com.asoom.tomandjerry.ui.theme.TextDarkGreyColor
import com.asoom.tomandjerry.ui.theme.TextPrimaryColor
import com.asoom.tomandjerry.ui.theme.TextWhiteColor
import com.asoom.tomandjerry.ui.theme.WhiteColor


@Composable
fun TomAccountScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundWhiteColor)
            .windowInsetsPadding(WindowInsets.systemBars.only(WindowInsetsSides.Top))
            .padding(bottom = 24.dp)
    ) {
        // Background image and profile (fixed position)
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(R.drawable.background_profile_account),
                contentDescription = "Background Profile Account",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .offset(y = (-20).dp),
                contentScale = ContentScale.FillWidth
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                contentAlignment = Alignment.Center
            ) {
                TomProfile()
            }
        }

        // Scrollable card content starting below profile
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 210.dp)
        ) {
            item {
                TomAccountCardContainer()
            }

            item {
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}

@Composable
private fun TomProfile() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 6.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(R.drawable.profile_account),
            contentDescription = "Profile Account",
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = TextPrimaryColor.copy(alpha = .15f),
                    shape = RoundedCornerShape(size = 12.dp)
                )
                .size(78.dp),
        )
        Text(
            modifier = Modifier.padding(top = 4.dp),
            text = "Tom",
            style = TextStyle(
                fontSize = 22.sp,
                lineHeight = 23.4.sp,
                fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                fontWeight = FontWeight.Medium,
                color = WhiteColor,
            )
        )
        Text(
            text = "specializes in failure!",
            style = TextStyle(
                fontSize = 15.sp,
                lineHeight = 20.sp,
                fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_regular)),
                fontWeight = FontWeight.Normal,
                color = TextWhiteColor.copy(alpha = .80f),
            )
        )
        Spacer(modifier = Modifier.height(4.dp))

        Row(
            modifier = Modifier
                .width(124.dp)
                .height(30.dp)
                .background(
                    color = Color.White.copy(alpha = .12f),
                    shape = RoundedCornerShape(size = 40.dp)
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Edit foolishness",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    letterSpacing = 0.2.sp,
                )
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
    }
}

@Composable
fun TomAccountCardContainer() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp))
            .background(BackgroundWhiteColor)
            .padding(bottom = 24.dp, top = 26.dp),
    ) {
        Column(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            TomCards()
            Spacer(modifier = Modifier.height(24.dp))
            TomSettings()
            Spacer(modifier = Modifier.height(12.dp))
        }

        Box(
            modifier = Modifier
                .padding(0.dp)
                .fillMaxWidth()
                .height(1.dp)
                .background(color = BorderGrayColor)
        )
        Column(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            HisFavoriteFoods()
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "v.TomBeta",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_regular)),
                    fontWeight = FontWeight.Normal,
                    color = TextDarkGreyColor.copy(alpha = .60f),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp, bottom = 20.dp)
            )
        }
    }
}

@Composable
private fun TomCards() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            Box(modifier = Modifier.weight(1f)) {
                TomCards(
                    id = R.drawable.state_evil_ic,
                    label = "2M 12K",
                    description = "No. of quarrels",
                    color = LightBabyBlueColor
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                TomCards(
                    id = R.drawable.state_run_ic,
                    label = "+500 h",
                    description = "Chase time",
                    color = BackgroundGreenColor
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            Box(modifier = Modifier.weight(1f)) {
                TomCards(
                    id = R.drawable.state_sad_ic,
                    label = "2M 12K",
                    description = "Hunting times",
                    color = BackgroundBinkColor
                )
            }
            Box(modifier = Modifier.weight(1f)) {
                TomCards(
                    id = R.drawable.state_health_ic,
                    label = "3M 7K",
                    description = "Heartbroken",
                    color = BackgroundYellowColor,
                )
            }
        }
    }
}

@Composable
private fun TomCards(
    @DrawableRes id: Int,
    label: String,
    description: String,
    color: Color
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(72.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .background(
                color = color
            ),
        verticalAlignment = Alignment.CenterVertically,

        ) {
        Image(
            painter = painterResource(id),
            contentDescription = "Jerry Store Logo",
            modifier = Modifier
                .size(62.dp)
                .padding(start = 12.dp),
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(
                text = label,
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 16.sp,
                    fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_semi_bold)),
                    fontWeight = FontWeight.SemiBold,
                    color = TextDarkGreyColor.copy(alpha = .60f),
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.5.sp,
                )
            )
            Text(
                text = description,
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 16.sp,
                    fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_semi_bold)),
                    fontWeight = FontWeight.SemiBold,
                    color = TextDarkGreyColor.copy(alpha = .37f),
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.5.sp,
                )
            )
        }
    }
}

@Composable
fun TomSettings() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Tom settings",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_bold)),
                color = TextPrimaryColor.copy(alpha = .78f),
                letterSpacing = 0.1.sp
            )
        )
        Spacer(modifier = Modifier.height(8.dp))

        val items = listOf(
            TomSettingsModel(
                icon = R.drawable.bed_single_ic,
                label = "Change sleeping place"
            ),
            TomSettingsModel(
                icon = R.drawable.meow_ic,
                label = "Meow settings"
            ),
            TomSettingsModel(
                icon = R.drawable.fridge_ic,
                label = "Password to open the fridge"
            ),
        )
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items.forEach {
                TomSettingsRow(it)
            }
        }
    }
}

@Composable
fun HisFavoriteFoods() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "His favorite foods",
            style = TextStyle(
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_bold)),
                fontWeight = FontWeight.Bold,
                color = TextPrimaryColor.copy(alpha = .78f),
                letterSpacing = 0.1.sp
            )
        )
        Spacer(modifier = Modifier.height(8.dp))

        val items = listOf(
            TomSettingsModel(
                icon = R.drawable.alert_ic,
                label = "Mouses"
            ),
            TomSettingsModel(
                icon = R.drawable.meal_ic,
                label = "Last stolen meal"
            ),
            TomSettingsModel(
                icon = R.drawable.sleeping_ic,
                label = "Change sleep mood"
            ),
        )
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items.forEach {
                TomSettingsRow(it)
            }
        }
    }
}

@Composable
fun TomSettingsRow(item: TomSettingsModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .background(Color.White, RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(item.icon),
                contentDescription = null,
                modifier = Modifier.size(28.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = item.label,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
            fontSize = 20.sp,
            color = TextDarkGreyColor.copy(alpha = .60f),
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun TomAccountScreenPreview() {
    TomAccountScreen()
}
