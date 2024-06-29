/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80033
 Source Host           : localhost:3306
 Source Schema         : book_borrowing

 Target Server Type    : MySQL
 Target Server Version : 80033
 File Encoding         : 65001

 Date: 29/06/2024 18:31:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `author` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `status` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `borrower` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `borrow_date` datetime NULL DEFAULT NULL,
  `return_date` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES (1, '三国演义', '罗贯中', '已借出', 'cxw', '2024-06-29 17:59:52', NULL);
INSERT INTO `books` VALUES (2, '水浒传', '施耐庵', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (3, '西游记', '吴承恩', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (4, '红楼梦', '曹雪芹', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (5, '白鹿原', '陈忠实', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (6, '围城', '钱钟书', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (7, '平凡的世界', '路遥', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (8, '活着', '余华', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (9, '边城', '沈从文', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (10, '许三观卖血记', '余华', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (11, '三国演义', '罗贯中', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (12, '水浒传', '施耐庵', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (13, '西游记', '吴承恩', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (14, '红楼梦', '曹雪芹', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (15, '白鹿原', '陈忠实', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (16, '围城', '钱钟书', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (17, '平凡的世界', '路遥', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (18, '活着', '余华', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (19, '边城', '沈从文', '可借阅', NULL, NULL, NULL);
INSERT INTO `books` VALUES (20, '许三观卖血记', '余华', '可借阅', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
