package com.asoom.tomandjerry.ui.screens

import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asoom.tomandjerry.R
import com.asoom.tomandjerry.ui.theme.BackgroundBabyBlueColor
import com.asoom.tomandjerry.ui.theme.BackgroundWhiteColor
import com.asoom.tomandjerry.ui.theme.BlueColor
import com.asoom.tomandjerry.ui.theme.DotWhiteTranslucentColor
import com.asoom.tomandjerry.ui.theme.LightBabyBlueColor
import com.asoom.tomandjerry.ui.theme.LightGrayBorderColor
import com.asoom.tomandjerry.ui.theme.PrimaryColor
import com.asoom.tomandjerry.ui.theme.SecondaryColor
import com.asoom.tomandjerry.ui.theme.TextDarkBabyBlueColor
import com.asoom.tomandjerry.ui.theme.TextDarkGreyColor
import com.asoom.tomandjerry.ui.theme.TextPrimaryColor
import com.asoom.tomandjerry.ui.theme.TextWhiteColor
import com.asoom.tomandjerry.ui.theme.WhiteColor


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TomKitchenScreen() {
    Scaffold(
        bottomBar = { BottomBar() }
    ) { _ ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.systemBars.only(WindowInsetsSides.Top))
                .verticalScroll(rememberScrollState())
        ) {
            KitchenContent()
        }
    }
}

@Composable
private fun CardRounded() {
    Card(
        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
        colors = CardDefaults.cardColors(containerColor = BackgroundWhiteColor),
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp, bottom = 16.dp)
        ) {
            CardTitle()
            Spacer(modifier = Modifier.height(15.dp))
            CardPriceAndFavorite()
            Spacer(modifier = Modifier.height(14.dp))
            CardDescription()
            Spacer(modifier = Modifier.height(24.dp))
            CardSectionTitle("Details")
            Spacer(modifier = Modifier.height(10.dp))
            DetailsRow()
            Spacer(modifier = Modifier.height(24.dp))
            CardSectionTitle("Preparation method")
            Spacer(modifier = Modifier.height(10.dp))
            PreparationMethod()
        }
    }
}

@Composable
private fun KitchenContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundBabyBlueColor.copy(alpha = 0.5f))
            .padding(bottom = 113.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.50f)
                .align(Alignment.TopStart)
        ) {
            Image(
                painter = painterResource(R.drawable.pasta_ellipse),
                contentDescription = "Pasta Ellipse",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(404.dp)
                    .offset(y = (-28).dp),
                contentScale = ContentScale.FillBounds,
                alignment = Alignment.TopStart
            )
            LabelsOverlay()
        }
        CardRoundedContainer()
        PastaImageOverlay()
    }
}

@Composable
private fun PastaEllipseWithLabels() {

}

@Composable
private fun LabelsOverlay() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(start = 16.dp, top = 46.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            IconLabelRow(
                iconRes = R.drawable.ruler_ic,
                text = "High tension",
                iconSize = 28.dp
            )
            IconLabelRow(
                iconRes = R.drawable.chef_ic,
                text = "Shocking foods",
                iconSize = 29.dp
            )
        }
    }
}

@Composable
private fun IconLabelRow(
    @DrawableRes iconRes: Int,
    text: String,
    iconSize: Dp
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painterResource(iconRes),
            contentDescription = text,
            modifier = Modifier.size(iconSize)
        )
        Text(
            text = text,
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 24.sp,
                fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                fontWeight = FontWeight.Medium,
                color = TextWhiteColor.copy(alpha = 0.87f),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp
            ),
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Composable
private fun CardRoundedContainer() {
    Box(modifier = Modifier.padding(top = 204.dp)) {
        CardRounded()
    }
}

@Composable
private fun PastaImageOverlay() {
    Box(
        Modifier
            .fillMaxSize()
            .offset(x = (-23).dp, y = 18.dp),
        contentAlignment = Alignment.BottomEnd
    ) {
        Image(
            painter = painterResource(R.drawable.pasta),
            contentDescription = "Pasta Plate",
            modifier = Modifier
                .width(250.dp)
                .height(217.dp)
        )
    }
}

@Composable
private fun CardTitle() {
    Text(
        text = "Electric Tom pasta",
        style = TextStyle(
            fontSize = 24.sp,
            lineHeight = 33.sp,
            letterSpacing = 0.5.sp,
            fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
            fontWeight = FontWeight.Medium,
            color = TextPrimaryColor,
            textAlign = TextAlign.Center
        ),
        modifier = Modifier.padding(top = 35.dp)
    )
}

@Composable
private fun CardPriceAndFavorite() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(SecondaryColor)
                .width(123.dp)
                .height(35.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.kitchen_money_bag),
                    contentDescription = "Cheese Bag",
                    tint = PrimaryColor,
                    modifier = Modifier
                        .size(20.dp)
                        .padding(start = 1.dp)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    text = " 5 cheeses ",
                    color = PrimaryColor,
                    fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
            }
        }

        Icon(
            painter = painterResource(id = R.drawable.heart_ic),
            contentDescription = "Tom Image",
            tint = Color(0xFF226B97),
            modifier = Modifier
                .size(28.dp)
                .offset(y = (-23).dp)
        )
    }
}

@Composable
private fun CardDescription() {
    Text(
        text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
        style = TextStyle(
            fontSize = 17.sp,
            lineHeight = 19.sp,
            fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
            fontWeight = FontWeight.Medium,
            color = TextDarkGreyColor.copy(alpha = 0.6f),
            letterSpacing = 0.7.sp
        )
    )
}

@Composable
private fun CardSectionTitle(title: String) {
    Text(
        text = title,
        style = TextStyle(
            fontSize = 22.sp,
            lineHeight = 33.sp,
            fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
            fontWeight = FontWeight.Medium,
            color = TextPrimaryColor.copy(alpha = 0.87f),
            textAlign = TextAlign.Center,
            letterSpacing = 0.5.sp
        )
    )
}

@Composable
fun DetailsCard(
    @DrawableRes icon: Int,
    value: String,
    label: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(129.dp)
            .background(color = Color(0xFFD0E5F0), shape = RoundedCornerShape(size = 12.dp)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painterResource(icon),
            contentDescription = null,
            modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = value,
            style = TextStyle(
                fontSize = 17.sp,
                lineHeight = 16.sp,
                fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                fontWeight = FontWeight.Medium,
                color = Color(0x99121212),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            )
        )

        Text(
            text = label,
            style = TextStyle(
                fontSize = 15.sp,
                fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                fontWeight = FontWeight.Medium,
                color = Color(0x5E121212),
                textAlign = TextAlign.Center,
            )
        )
    }
}

@Composable
fun DetailsRow() {
    Row(
        modifier = Modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Box(modifier = Modifier.weight(1f)) {
            DetailsCard(
                icon = R.drawable.tempreture_ic,
                value = "1000 V",
                label = "Temperature"
            )
        }
        Box(modifier = Modifier.weight(1f)) {
            DetailsCard(
                icon = R.drawable.timer_ic,
                value = "3 sparks",
                label = "Time"
            )
        }

        Box(modifier = Modifier.weight(1f)) {
            DetailsCard(
                icon = R.drawable.evil_ic,
                value = "1M 12K",
                label = "No. of deaths"
            )
        }
    }
}

@Composable
fun PreparationMethod() {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            PreparationRow(
                number = "1",
                text = "Put the pasta in a toaster.",
                modifier = Modifier.fillMaxWidth()
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            PreparationRow(
                number = "2",
                text = "Pour battery juice over it.",
                modifier = Modifier.fillMaxWidth()
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            PreparationRow(
                number = "3",
                text = "Wait for the spark to ignite.",
                modifier = Modifier.fillMaxWidth()
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            PreparationRow(
                number = "4",
                text = "Serve with an insulating glove.",
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun PreparationRow(
    modifier: Modifier = Modifier,
    number: String,
    text: String
) {
    Row(
        modifier = modifier
            .height(40.dp)
            .background(
                Color.White,
                RoundedCornerShape(
                    topEnd = 16.dp,
                    bottomEnd = 16.dp,
                    topStart = 45.dp,
                    bottomStart = 45.dp
                )
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = LightBabyBlueColor,
                    shape = CircleShape
                )
                .size(44.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = number,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                    fontWeight = FontWeight.Medium,
                    color = TextDarkBabyBlueColor,
                    textAlign = TextAlign.Center,
                )
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            style = TextStyle(
                fontSize = 17.sp,
                fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_regular)),
                fontWeight = FontWeight.Normal,
                color = TextDarkGreyColor.copy(alpha = .60f),
                textAlign = TextAlign.Center,
            )
        )
    }
}

@Composable
fun BottomBar() {
    Box(
        modifier = Modifier
            .border(1.dp, LightGrayBorderColor)
            .fillMaxWidth()
            .height(102.dp)
            .background(WhiteColor)
            .padding(start = 20.dp, end = 20.dp, top = 16.dp, bottom = 6.dp)
    ) {
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(66.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = BlueColor,
                contentColor = WhiteColor
            )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Add to cart",
                    style = TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 18.sp,
                        fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                        fontWeight = FontWeight.Medium,
                        color = TextWhiteColor.copy(alpha = 0.87f),
                        textAlign = TextAlign.Center,
                        letterSpacing = 0.5.sp
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(6.dp)
                        .background(DotWhiteTranslucentColor)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "3 cheeses",
                        style = TextStyle(
                            fontSize = 18.sp,
                            letterSpacing = 0.5.sp,
                            fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                            fontWeight = FontWeight.Medium,
                            color = WhiteColor
                        )
                    )
                    Text(
                        text = "5 cheeses",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.ipm_plex_sans_arabic_medium)),
                            fontWeight = FontWeight.Medium,
                            color = WhiteColor.copy(alpha = 0.8f),
                            textDecoration = TextDecoration.LineThrough
                        )
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun TomKitchenScreenPreview() {
    TomKitchenScreen()
}
