//package com.asoom.tomandjerry.ui.screens
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.offset
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material3.CircularProgressIndicator
//import androidx.compose.material3.HorizontalDivider
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.draw.clipToBounds
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.ColorFilter
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.text.style.TextOverflow
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.Dp
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.tom_and_jerry.R
//import com.example.tom_and_jerry.ui.theme.BackgroundWhite
//import com.example.tom_and_jerry.ui.theme.BorderGrey
//import com.example.tom_and_jerry.ui.theme.IBMPlexSansArabic
//import com.example.tom_and_jerry.ui.theme.PrimaryColor
//import com.example.tom_and_jerry.ui.theme.SecondaryColor
//import com.example.tom_and_jerry.ui.theme.TextDarkGreyColor
//import com.example.tom_and_jerry.ui.theme.TextPrimaryColor
//import com.example.tom_and_jerry.ui.theme.TextWhiteColor
//import com.example.tom_and_jerry.ui.theme.White
//import kotlin.math.cos
//import kotlin.math.sin
//
//@Composable
//fun Screen3() {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = White)
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.profile_background),
//            contentDescription = "Meal Background",
//            modifier = Modifier.fillMaxWidth(),
//            contentScale = ContentScale.FillWidth
//        )
//        Column(
//            modifier = Modifier
//                .padding(top = 166.dp)
//                .fillMaxSize()
//                .clip(shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
//                .background(color = BackgroundWhite)
//                .padding(top = 23.dp)
//        ) {
//            Column(
//                modifier = Modifier
//                    .weight(1f)
//                    .verticalScroll(rememberScrollState())
//            ) {
//                Row(
//                    modifier = Modifier
//                        .height(56.dp)
//                        .padding(horizontal = 16.dp)
//                ) {
//                    Row(
//                        modifier = Modifier
//                            .weight(1f)
//                            .clip(RoundedCornerShape(12.dp))
//                            .background(color = SecondaryColor)
//                            .padding(vertical = 6.dp)
//                    ) {
//                        Spacer(Modifier.width(10.dp))
//                        Box(
//                            modifier = Modifier
//                                .size(45.dp)
//                        ) {
//                            Box(
//                                modifier = Modifier
//                                    .size(40.dp)
//                                    .clip(CircleShape)
//                                    .background(color = White)
//                                    .align(Alignment.Center),
//                            )
//                            CircularProgressIndicatorWithDot(
//                                progressPercentage = 0.62f,
//                                size = 45.dp,
//                                color = PrimaryColor,
//                            )
//                            Image(
//                                painter = painterResource(id = R.drawable.devil),
//                                contentDescription = "Devil",
//                                modifier = Modifier
//                                    .size(22.dp)
//                                    .align(Alignment.Center),
//                                colorFilter = ColorFilter.tint(PrimaryColor)
//                            )
//                        }
//                        Column(
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .padding(horizontal = 8.dp),
//                            verticalArrangement = Arrangement.Center
//                        ) {
//                            Text(
//                                text = "2M 12K",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.SemiBold,
//                                fontSize = 16.sp,
//                                lineHeight = 8.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.6f),
//                            )
//                            Text(
//                                text = "No. of quarrels",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 12.sp,
//                                lineHeight = 8.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.37f),
//                            )
//                        }
//                    }
//                    Spacer(Modifier.width(8.dp))
//                    Row(
//                        modifier = Modifier
//                            .weight(1f)
//                            .clip(RoundedCornerShape(12.dp))
//                            .background(color = Color(0xFFDEEECD))
//                            .padding(vertical = 6.dp)
//                    ) {
//                        Box(
//                            modifier = Modifier
//                                .size(45.dp)
//                        ) {
//                            Box(
//                                modifier = Modifier
//                                    .size(40.dp)
//                                    .clip(CircleShape)
//                                    .background(color = White)
//                                    .align(Alignment.Center),
//                            )
//                            CircularProgressIndicatorWithDot(
//                                progressPercentage = 0.22f,
//                                size = 45.dp,
//                                color = Color(0xFF57AB0F),
//                            )
//                            Image(
//                                painter = painterResource(id = R.drawable.running),
//                                contentDescription = "Running",
//                                modifier = Modifier
//                                    .size(22.dp)
//                                    .align(Alignment.Center),
//                                colorFilter = ColorFilter.tint(Color(0xFF57AB0F))
//                            )
//                        }
//                        Column(
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .padding(horizontal = 8.dp),
//                            verticalArrangement = Arrangement.Center
//                        ) {
//                            Text(
//                                text = "+500 h",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.SemiBold,
//                                fontSize = 16.sp,
//                                lineHeight = 8.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.6f),
//                            )
//                            Text(
//                                text = "Chase time",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 12.sp,
//                                lineHeight = 8.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.37f),
//                            )
//                        }
//                    }
//                }
//                Spacer(Modifier.height(8.dp))
//                Row(
//                    modifier = Modifier
//                        .height(56.dp)
//                        .padding(horizontal = 16.dp)
//                ) {
//                    Row(
//                        modifier = Modifier
//                            .weight(1f)
//                            .clip(RoundedCornerShape(12.dp))
//                            .background(color = Color(0xFFF2D9E7))
//                            .padding(vertical = 6.dp)
//                    ) {
//                        Spacer(Modifier.width(10.dp))
//                        Box(
//                            modifier = Modifier
//                                .size(45.dp)
//                        ) {
//                            Box(
//                                modifier = Modifier
//                                    .size(40.dp)
//                                    .clip(CircleShape)
//                                    .background(color = White)
//                                    .align(Alignment.Center),
//                            )
//                            CircularProgressIndicatorWithDot(
//                                progressPercentage = 0.92f,
//                                size = 45.dp,
//                                color = Color(0xFFF46983),
//                            )
//                            Image(
//                                painter = painterResource(id = R.drawable.sad),
//                                contentDescription = "Sad",
//                                modifier = Modifier
//                                    .size(22.dp)
//                                    .align(Alignment.Center),
//                                colorFilter = ColorFilter.tint(Color(0xFFF46983))
//                            )
//                        }
//                        Column(
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .padding(horizontal = 8.dp),
//                            verticalArrangement = Arrangement.Center
//                        ) {
//                            Text(
//                                text = "2M 12K",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.SemiBold,
//                                fontSize = 16.sp,
//                                lineHeight = 8.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.6f),
//                            )
//                            Text(
//                                text = "Hunting times",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 12.sp,
//                                lineHeight = 8.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.37f),
//                            )
//                        }
//                    }
//                    Spacer(Modifier.width(8.dp))
//                    Row(
//                        modifier = Modifier
//                            .weight(1f)
//                            .clip(RoundedCornerShape(12.dp))
//                            .background(color = Color(0xFFFAEDCF))
//                            .padding(vertical = 6.dp)
//                    ) {
//                        Box(
//                            modifier = Modifier
//                                .size(45.dp)
//                        ) {
//                            Box(
//                                modifier = Modifier
//                                    .size(40.dp)
//                                    .clip(CircleShape)
//                                    .background(color = White)
//                                    .align(Alignment.Center),
//                            )
//                            CircularProgressIndicatorWithDot(
//                                progressPercentage = 0.12f,
//                                size = 45.dp,
//                                color = Color(0xFFFFBF1A),
//                            )
//                            Image(
//                                painter = painterResource(id = R.drawable.broken_heart),
//                                contentDescription = "Broken Heart",
//                                modifier = Modifier
//                                    .size(22.dp)
//                                    .align(Alignment.Center),
//                                colorFilter = ColorFilter.tint(Color(0xFFFFBF1A))
//                            )
//                        }
//                        Column(
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .padding(horizontal = 8.dp),
//                            verticalArrangement = Arrangement.Center
//                        ) {
//                            Text(
//                                text = "3M 7K",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.SemiBold,
//                                fontSize = 16.sp,
//                                lineHeight = 8.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.6f),
//                            )
//                            Text(
//                                text = "Heartbroken",
//                                fontFamily = IBMPlexSansArabic,
//                                fontWeight = FontWeight.Medium,
//                                fontSize = 12.sp,
//                                lineHeight = 8.sp,
//                                letterSpacing = 0.5.sp,
//                                overflow = TextOverflow.Ellipsis,
//                                color = TextDarkGreyColor.copy(alpha = 0.37f),
//                            )
//                        }
//                    }
//                }
//                Spacer(Modifier.height(24.dp))
//                Column(
//                    modifier = Modifier.padding(horizontal = 16.dp)
//                ) {
//                    Text(
//                        text = "Tom settings",
//                        fontFamily = IBMPlexSansArabic,
//                        fontWeight = FontWeight.Bold,
//                        fontSize = 20.sp,
//                        color = TextPrimaryColor.copy(alpha = 0.87f),
//                    )
//                    Spacer(Modifier.height(4.dp))
//                    Row(
//                        verticalAlignment = Alignment.CenterVertically,
//                    ) {
//                        Box(
//                            modifier = Modifier
//                                .size(40.dp)
//                                .clip(RoundedCornerShape(8.dp))
//                                .background(White),
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.bed),
//                                contentDescription = "Bed",
//                                modifier = Modifier
//                                    .size(24.dp)
//                                    .align(Alignment.Center),
//                            )
//                        }
//                        Spacer(Modifier.width(8.dp))
//                        Text(
//                            text = "Change sleeping place",
//                            fontFamily = IBMPlexSansArabic,
//                            fontWeight = FontWeight.Medium,
//                            fontSize = 16.sp,
//                            color = TextPrimaryColor.copy(alpha = 0.87f),
//                        )
//                    }
//                    Spacer(Modifier.height(12.dp))
//                    Row(
//                        verticalAlignment = Alignment.CenterVertically,
//                    ) {
//                        Box(
//                            modifier = Modifier
//                                .size(40.dp)
//                                .clip(RoundedCornerShape(8.dp))
//                                .background(White),
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.kitten),
//                                contentDescription = "Bed",
//                                modifier = Modifier
//                                    .size(24.dp)
//                                    .align(Alignment.Center),
//                            )
//                        }
//                        Spacer(Modifier.width(8.dp))
//                        Text(
//                            text = "Meow settings",
//                            fontFamily = IBMPlexSansArabic,
//                            fontWeight = FontWeight.Medium,
//                            fontSize = 16.sp,
//                            color = TextPrimaryColor.copy(alpha = 0.87f),
//                        )
//                    }
//                    Spacer(Modifier.height(12.dp))
//                    Row(
//                        verticalAlignment = Alignment.CenterVertically,
//                    ) {
//                        Box(
//                            modifier = Modifier
//                                .size(40.dp)
//                                .clip(RoundedCornerShape(8.dp))
//                                .background(White),
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.fridge),
//                                contentDescription = "Bed",
//                                modifier = Modifier
//                                    .size(24.dp)
//                                    .align(Alignment.Center),
//                            )
//                        }
//                        Spacer(Modifier.width(8.dp))
//                        Text(
//                            text = "Password to open the fridge",
//                            fontFamily = IBMPlexSansArabic,
//                            fontWeight = FontWeight.Medium,
//                            fontSize = 16.sp,
//                            color = TextPrimaryColor.copy(alpha = 0.87f),
//                        )
//                    }
//                }
//                Spacer(Modifier.height(12.dp))
//                HorizontalDivider(color = BorderGrey.copy(alpha = 0.12f), thickness = 1.dp)
//                Spacer(Modifier.height(12.dp))
//                Column(
//                    modifier = Modifier.padding(horizontal = 16.dp)
//                ) {
//                    Text(
//                        text = "His favorite foods",
//                        fontFamily = IBMPlexSansArabic,
//                        fontWeight = FontWeight.Bold,
//                        fontSize = 20.sp,
//                        color = TextPrimaryColor.copy(alpha = 0.87f),
//                    )
//                    Spacer(Modifier.height(4.dp))
//                    Row(
//                        verticalAlignment = Alignment.CenterVertically,
//                    ) {
//                        Box(
//                            modifier = Modifier
//                                .size(40.dp)
//                                .clip(RoundedCornerShape(8.dp))
//                                .background(White),
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.warning),
//                                contentDescription = "Bed",
//                                modifier = Modifier
//                                    .size(24.dp)
//                                    .align(Alignment.Center),
//                            )
//                        }
//                        Spacer(Modifier.width(8.dp))
//                        Text(
//                            text = "Mouses",
//                            fontFamily = IBMPlexSansArabic,
//                            fontWeight = FontWeight.Medium,
//                            fontSize = 16.sp,
//                            color = TextPrimaryColor.copy(alpha = 0.87f),
//                        )
//                    }
//                    Spacer(Modifier.height(12.dp))
//                    Row(
//                        verticalAlignment = Alignment.CenterVertically,
//                    ) {
//                        Box(
//                            modifier = Modifier
//                                .size(40.dp)
//                                .clip(RoundedCornerShape(8.dp))
//                                .background(White),
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.meal),
//                                contentDescription = "Bed",
//                                modifier = Modifier
//                                    .size(24.dp)
//                                    .align(Alignment.Center),
//                            )
//                        }
//                        Spacer(Modifier.width(8.dp))
//                        Text(
//                            text = "Last stolen meal",
//                            fontFamily = IBMPlexSansArabic,
//                            fontWeight = FontWeight.Medium,
//                            fontSize = 16.sp,
//                            color = TextPrimaryColor.copy(alpha = 0.87f),
//                        )
//                    }
//                    Spacer(Modifier.height(12.dp))
//                    Row(
//                        verticalAlignment = Alignment.CenterVertically,
//                    ) {
//                        Box(
//                            modifier = Modifier
//                                .size(40.dp)
//                                .clip(RoundedCornerShape(8.dp))
//                                .background(White),
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.sleep),
//                                contentDescription = "Bed",
//                                modifier = Modifier
//                                    .size(24.dp)
//                                    .align(Alignment.Center),
//                            )
//                        }
//                        Spacer(Modifier.width(8.dp))
//                        Text(
//                            text = "Change sleep mood",
//                            fontFamily = IBMPlexSansArabic,
//                            fontWeight = FontWeight.Medium,
//                            fontSize = 16.sp,
//                            color = TextPrimaryColor.copy(alpha = 0.87f),
//                        )
//                    }
//                }
//                Spacer(Modifier.height(32.dp))
//                Text(
//                    text = "v.TomBeta",
//                    fontFamily = IBMPlexSansArabic,
//                    fontWeight = FontWeight.Normal,
//                    fontSize = 12.sp,
//                    color = TextDarkGreyColor.copy(alpha = 0.6f),
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier.fillMaxWidth(),
//                )
//            }
//        }
//        Column(
//            modifier = Modifier
//                .padding(top = 16.dp)
//                .fillMaxWidth(),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.profile_2),
//                contentDescription = "Tom and Jerry",
//                modifier = Modifier
//                    .size(64.dp)
//                    .clip(RoundedCornerShape(12.dp))
//                    .clipToBounds(),
//                contentScale = ContentScale.Fit
//            )
//            Spacer(Modifier.height(2.dp))
//            Text(
//                text = "Tom",
//                fontFamily = IBMPlexSansArabic,
//                fontWeight = FontWeight.Medium,
//                color = TextWhiteColor,
//                fontSize = 18.sp,
//                lineHeight = 8.sp,
//                textAlign = TextAlign.Center,
//            )
//            Text(
//                text = "specializes in failure!",
//                fontFamily = IBMPlexSansArabic,
//                fontWeight = FontWeight.Normal,
//                color = TextWhiteColor.copy(alpha = 0.8f),
//                fontSize = 12.sp,
//                lineHeight = 8.sp,
//                textAlign = TextAlign.Center,
//            )
//            Spacer(Modifier.height(4.dp))
//            Box(
//                modifier = Modifier
//                    .clip(RoundedCornerShape(40.dp))
//                    .background(color = White.copy(alpha = 0.12f))
//                    .padding(horizontal = 12.dp, vertical = 6.dp),
//            ) {
//                Text(
//                    text = "Edit foolishness",
//                    fontFamily = IBMPlexSansArabic,
//                    fontWeight = FontWeight.Medium,
//                    fontSize = 10.sp,
//                    lineHeight = 8.sp,
//                    maxLines = 1,
//                    color = TextWhiteColor,
//                )
//            }
//        }
//    }
//}
//
//@Composable
//private fun CircularProgressIndicatorWithDot(
//    progressPercentage: Float,
//    size: Dp,
//    color: Color,
//) {
//    val circleRadius = (size.value - 5.0) / 2.0
//    val finalAngleDegrees = -90f + (progressPercentage.coerceIn(0f, 1f) * 360f)
//    val angleRadians = Math.toRadians(finalAngleDegrees.toDouble())
//    val dotX = circleRadius * cos(angleRadians).toFloat()
//    val dotY = circleRadius * sin(angleRadians).toFloat()
//    Box(
//        modifier = Modifier
//    ) {
//        CircularProgressIndicator(
//            progress = { progressPercentage },
//            modifier = Modifier
//                .size(size - 4.dp)
//                .align(Alignment.Center),
//            color = color,
//            trackColor = Color.Transparent,
//            strokeWidth = 1.dp,
//        )
//        Box(
//            modifier = Modifier.size(size)
//        ) {
//            Box(
//                modifier = Modifier
//                    .align(Alignment.Center)
//                    .offset(x = dotX.dp, y = dotY.dp)
//                    .size(5.dp)
//                    .clip(CircleShape)
//                    .background(color = color),
//            )
//        }
//    }
//}
//
//@Preview(widthDp = 360, heightDp = 772)
//@Composable
//fun Screen3Preview() {
//    Screen3()
//}